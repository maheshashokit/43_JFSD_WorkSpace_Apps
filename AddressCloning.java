public class AddressCloning implements Cloneable{

	public String streetName;
	public String cityName;

	public AddressCloning() {
		System.out.println("AddressCloning Class Constructor");
	}

	public AddressCloning(String streetName, String cityName) {
		this.streetName = streetName;
		this.cityName = cityName;
	}

	public void displayAddressDetails() {
		System.out.println("StreetName ::::" + streetName);
		System.out.println("CityName   ::::" + cityName);
	}
	
	@Override
	protected AddressCloning clone() throws CloneNotSupportedException {
		Object addressObj = super.clone();
		
		AddressCloning address = (AddressCloning)addressObj;
		
		return address;
	}

}
