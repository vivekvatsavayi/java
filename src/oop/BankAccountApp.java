package oop;
//for git - 25 april
//public is used so client can access what they need
public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account -- think instantiate an object
		
		
		//So here we are creating an object from the class BankAccount.java and now the constructor from that class will be invoked
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Akash Varma";
		//lets define variables with Encapsulation
		acc1.setName("Akash Varma");
		//System.out.println(acc1.getName());
		
		acc1.setSsn("9472482920");
		//System.out.println("SSN: " + acc1.getSsn());
		
		
		acc1.accountNumber = "897000000";
		acc1.balance = 100000;
		
		/*
		acc1.setRate();
		acc1.increaseRate();
		
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		*/
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
	
		
		
		//calling same method with different parameters - polymorphism
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount(": Checking account");
		acc2.accountNumber = "897000000";
	
		
		
		BankAccount acc3 = new BankAccount(": Savings Account", 5000);
		acc3.accountNumber = "897000000";
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
		//acc3.checkBalance();
		/*
		//Demo for inheritance
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Penmetsa";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}
}
