public class FilterMethodOverloading {

	//Getting Products based on various parameters
	public void getProductsInfo(String productBrand) {
		System.out.println("Getting Products Based on ProductBrand....");
	}
	
	public float getProductsInfo(float price) {
		System.out.println("Getting Products Based on Price.......");
		return 0.0f;
	}
	
	public int getProductsInfo(int startPrice,int endPrice) {
		System.out.println("Getting Products Based on Start & End Price Ranges....");
		return 0;
	}
	
	public void getProductsInfo(String productType,float productRatings) {
		System.out.println("Getting Products Basedon productType with product Ratings....");
	}
	
	//Defining the static methods to be overloaded
	public static void getProductsInfo() {
		System.out.println("Getting All Producst Information With out any Filter");
	}
	
	public static void getProductsInfo(boolean favourite) {
		System.out.println("Getting All products Information based on Favourite Marked...");
	}
	
	public static void main(String[] args) {
		
		//creating the object for same class
		FilterMethodOverloading fmo = new FilterMethodOverloading();
		
		//calling methods
		fmo.getProductsInfo(150, 200);
		fmo.getProductsInfo("LG");
		fmo.getProductsInfo(25000f);
		
		//Calling the Overloaded Main Method
		FilterMethodOverloading.getProductsInfo();
		FilterMethodOverloading.getProductsInfo(true);
		
		Integer a[] = {10,20,30};
		main(a);
		
	}
	
	public static void main(Integer[] args) {
		System.out.println("Overloaded the Main Method.....");
	} 
}