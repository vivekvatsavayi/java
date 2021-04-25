package basics;
//for git - 25 april
public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		//System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
	}
	
	//void means it wont return anything
	
	//function with no parameter and no return type
	static void printName() {
		System.out.println("My name is surya");
	}
	
	//function with parameters and a return type
	static void addNumbers(int numberA, int numberB) {
		//this function will add two numbers
		
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}
	
	//function that has return type with parameters
	
	static int multiplyNumbers(int valueA, int valueB) {
		
		int product = valueA * valueB;
		addNumbers(product + 50, product);
		return product;
		
	}
}
