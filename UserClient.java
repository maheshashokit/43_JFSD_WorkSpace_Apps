
public class UserClient {
	
	public static void main(String[] args) {
		
		//Creating object of user class
		User user = new User();
		user.setUsername("Mahesh");
		user.setPassword("Mahesh@123");
		user.setEmailId("mahesh.ashokit@gmail.com");
		System.out.println("Username ::::" + user.getUsername());
		System.out.println("Password ::::" + user.getPassword());
		System.out.println("EmailId  ::::" + user.getEmailId());
		System.out.println(user.displayUserDetails());
	}

}
