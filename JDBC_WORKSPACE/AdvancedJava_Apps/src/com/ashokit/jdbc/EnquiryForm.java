package com.ashokit.jdbc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.pool.OracleDataSource;

public class EnquiryForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnquiryForm frame = new EnquiryForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EnquiryForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To AshokIT Enquiry Form");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(268, 58, 718, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(416, 156, 63, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(423, 248, 23, -5);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(416, 235, 63, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ContactNo");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(367, 294, 112, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Course");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(403, 369, 70, 25);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(502, 229, 169, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(502, 165, 169, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(502, 285, 169, 34);
		contentPane.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "CoreJava", "AdvancedJava", "Spring", "SpringBoot", "Angular", "ReactJS", "HTML", "CSS", "JavaScript", "Python"}));
		comboBox.setBounds(502, 360, 169, 34);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("SendEnquiry");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked SendEnquiry Button......");
				
				//Logic to get the inputs from  Frame
				String enquiryName= textField_1.getText();
				String emailId = textField.getText();
				String contactNo = textField_2.getText();
				String course = (String)comboBox.getSelectedItem();
				System.out.println(enquiryName+"==="+ emailId+"===="+contactNo+"====="+course);
				
				//we can set the frame data into single object
				Enquiry enquiry = new Enquiry(enquiryName,emailId,contactNo,course);
				
				//calling database call method to insert data
				boolean insertEnquiryStatus = saveEnquiryDetails(enquiry);
				
				if(insertEnquiryStatus) {
					JOptionPane.showMessageDialog(contentPane, "EmailSent to AshokIT Admin Team....");
				}else {
					JOptionPane.showMessageDialog(contentPane,"Something Went Wrong...Please Reach out To AshokIT Admin Team.....","Alert",JOptionPane.WARNING_MESSAGE); 
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(383, 484, 143, 40);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked Cancel Button......");
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(561, 484, 143, 40);
		contentPane.add(btnCancel);
	}

	private boolean saveEnquiryDetails(Enquiry enquiry){
		
		OracleDataSource ods=null;
		try {
			ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			ods.setUser("system");
			ods.setPassword("manager");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        try(Connection con = ods.getConnection();
        	
        	PreparedStatement pstmt = con.prepareStatement("insert into ashokit_enquires values(ashokit_enquires_seq.nextval,?,?,?,?,?,?)")
           ){
        	
        	//setting values to placeholders
        	pstmt.setString(1, enquiry.getName());
        	pstmt.setString(2, enquiry.getEmailId());
        	pstmt.setString(3,enquiry.getContactNo());
        	pstmt.setString(4, enquiry.getCourseName());
        	pstmt.setTimestamp(5, new java.sql.Timestamp(new java.util.Date().getTime()));
        	pstmt.setString(6, "Mahesh");
        	
        	//executing the query
        	int rowCount = pstmt.executeUpdate();
        	
        	return rowCount != 0;
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return false;
	}
}
