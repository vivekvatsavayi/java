package oop;
//for git - 25 april
// every class automatically extends the object class. 
public class CDAccount extends BankAccount implements IRate {
	
	//class can extend only one class but implement multiple interfaces
	
	//defining variable
	
	String interestRate;
	
	
	//method
	void compound() {
		
		System.out.println("Compounding Interest");
		
	}
	
	

}
