//for git - 25 april
class Person{
	
	String name;
	String email;
	String phone;
	// we use void to say it is method
	void walk(){
		System.out.println(name + " is walking");
		
		
	}
	
	void eat(){
		
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		//Instantiating an object
		
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Surya";
		person1.email = "suryapenmetsa425@gmail.com";
		person1.phone = "93917889257";
		
		//Abstraction
		person1.walk();
		//person1.sleep();
		//person1.eat();		
		
		
		//create a new person
		Person person2 = new Person();
		person2.name = "Viv";
		person2.sleep();
		
		
		
		
		/*
		//Person
		//attributes or variables
		String name = "Viv";
		String email = "vivekvatsavayi@gmail.com";
		String phone = "94949495870";
		
		//action or behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
	}
	
	//enhance to minimize code and add another person with same behavior
	
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}
}