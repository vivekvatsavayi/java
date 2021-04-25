package projects;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("4653298742", 1000);
		BankAccount acc2 = new BankAccount("9391789257", 2000);
		BankAccount acc3 = new BankAccount("9494945870", 2500);
		
		acc1.setName("Akash");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}
}
class BankAccount implements IInterest{	
	//Properties of bank account
	//we use private for encapsulation so that the client does not have access to these....continued...
	//variables except through the methods we provide them
	private static int iD = 1000; //Internal iD //static means belongs to class
	private String accountNumber; //iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "0054400657";
	private String name;
	private String SSN;
	private double balance;
	
	//constructors
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		//System.out.println("New Account Created");
		this.SSN = SSN; //the instance variable ssn = local variable ssn
		iD ++;
		setAccountNumber();
		}
	
	private void setAccountNumber(){
		int random = (int) (Math.random()*100);
		//System.out.println(random);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying Bill: " + amount);
		balance = balance - amount;
		showBalance();
		
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making Deposit: " + amount);
		balance = balance + amount;
		showBalance();
		
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: "
				+ balance + "]\n";
		}
	

}
