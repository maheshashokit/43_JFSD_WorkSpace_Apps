//This is for Method Chaining
public class Person {
	
	//Defining the Fields
	private String name;
	private int age;

	public Person() {
		System.out.println("Non-Parameterized constructor.....");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void personInfo() {
		System.out.println("Person Name:::::" + name);
		System.out.println("Person Age :::::" + age);
	}

	public Person getPersonObject() {
		return this;
	}

	public static void main(String[] args) {

		Person p = new Person("Mahesh", 35);
		p.personInfo();

		System.out.println("***************************************");

		Person p1 = new Person("Ashok", 35);
		p1.personInfo();

		System.out.println("***************************************");

		p.getPersonObject().personInfo(); // Method Chaining
		p1.getPersonObject().personInfo(); // Method Chaining
	}
}
