package oop;
//for git - 25 april
public class BankAccount implements IRate {
	
	
	//Define variables
	String accountNumber;
	//static belongs to the CLASS not the object instance
	//final is like constant you cannot change when u create new object
	private static final String routingNumber = "200303"; //this variable belongs to class, can't be changes and is only access within class
	
	
	//instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Creating constructor
	//constructor definitions: these are unique methods
	// 1. They are used to initialize the state of an object
	// 2. Constructors are IMPLICITLY called upon instantiation.. implicit means it gets called automatically
	// 3. The same name as the class itself
	// 4. Constructors have NO return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: Call same method name with different arguments
	BankAccount(String accountType) {
		
		System.out.println("NEW ACCOUNT" + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		
		System.out.println("NEW ACCOUNT" + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if(initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be atleast $1000";
		}
		else {
			Msg = "Thanks for your initial deposit of: $ " + initDeposit;
		}
		
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters / Setters
	//we want to allow the user to define the name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	
	}
	
	public void increaseRate() {
		
		System.out.println("INCREASING RATE");
		
	}
	
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	//Private: can only be called from within the class
	private void showActivity(String activity) {
		
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $ " + balance);
	}
	
	void checkBalance() {
		
		System.out.println("Balance is: " + balance);
		
	}
	
	void getStatus() {
		
	}
	
	//toString extended from object class which was automatically inherited
	@Override
	public String toString() {
		return "[Name: "  + name + ", ACCOUNT # " + accountNumber + ", ROUTING # " + routingNumber + ", BALANCE: $" + balance + "]" ;
	}
	
	

}
