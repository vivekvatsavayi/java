package projects;

public class StudentDatabase {
	
	public static void main(String[] args) {
		
		//Create a student
		Student stu1 = new Student("Surya","763393380");
		Student stu2 = new Student("Tanooj","905950455");
		Student stu3 = new Student("Aarik","879005691");
		
		
		stu1.enroll("Math151");
		stu1.enroll("English142");
		stu1.enroll("Java101");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}
}

class Student {
	//properties
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	//constructor
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	//Setters and Getters to ensure encapsulation
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@datai.co";
		System.out.println("Your Email: " + email);
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() *((max-min)));
		randNum = randNum + min;
		//System.out.println(randNum);
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your user ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course; 
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	public void showCourses() {
		System.out.println(courses);
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String toString() {
		return "[NAME: " + name +" ]\n[COURSES: " + courses + "]\n[BALANCE: " + balance + "]";		
	}
}
