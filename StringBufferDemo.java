
public class StringBufferDemo {

	public static void main(String[] args) {
		
		System.out.println(getUserDetailsEmailBody("Mahesh", "mahesh.ashokit@gmail.com", "Mahesh@123"));

	}
	
	public static String getUserDetailsEmailBody(String username, String userEmailId, String userPassword) {

		StringBuffer emailContent = new StringBuffer();
		emailContent.append("GoodMorning ").append(username).append("\n\n");
		emailContent.append(ApplicationConstants.APPLICATION_MESSAGE).append("\n\n");
		emailContent.append("Here is your credentials to activate account in AshokIT portal").append("\n\n");
		emailContent.append(ApplicationConstants.USERNAMETITLE).append(userEmailId).append("\n");
		emailContent.append(ApplicationConstants.PASSWORDTITLE).append(userPassword).append("\n\n");
		emailContent.append("Wish you All the Best for learning course.").append("\n\n");
		emailContent.append("Thanks & Regards,").append("\n");
		emailContent.append("Ashok IT.");

		return emailContent.toString();

	}

}
