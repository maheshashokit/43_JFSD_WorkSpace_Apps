
public class Vendor {

	private int id;
	private String name;
	private String location;

	// Defining the Non-Parameterized Constructor
	public Vendor() {
		System.out.println("Non-Parameterized Constructor.....");
		id = 01;
		name = "AshokIT";
		location = "Hyderabad";
	}

	// Defining the parameterized constructor
	public Vendor(int id, String name, String location) {
		System.out.println("Parameterized Constructor.....");
		this.id = id;
		this.name = name;
		this.location = location;
	}

	// Defining the Parameterized Constructor which accepting Vendor as parameter
	public Vendor(Vendor v1) {
		System.out.println("Parameterized Constructor with Object as Parameter.....");
		id = v1.id;
		name = v1.name;
		location = v1.location;
	}

	public void displayVendorInformation() {
		System.out.println("Vendor ID       ::::::" + id);
		System.out.println("Vendor Name     ::::::" + name);
		System.out.println("Vendor Location ::::::" + location);
	}

	public static void main(String[] args) {

		// creating the object for Vendor Class
		Vendor v = new Vendor(); // This will call public non-parameterized constructor
		v.displayVendorInformation();

		System.out.println("==============================================");
		Vendor v1 = new Vendor(02, "Mahesh", "Bangalore"); // calling the Public parameterized constructor
		v1.displayVendorInformation();

		System.out.println("===============================================");
		Vendor v2 = new Vendor(v1); // calling the public parameterized constructuctor as object parameter
		v2.displayVendorInformation();
	}

}
