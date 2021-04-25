//for git - 25 april
public class SalaryCalculator {
	public static void main(String[] args) {
		//lets create a variable to define our career
		
		//Declare a variable
		String career;
		System.out.println("Program is starting");
		
		//Defined a variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println(salary);
		System.out.println("My salary as a" + career + "at the rate of $" + rate + "per hr is $" + salary + "per year. ");
		
		
		
		//compute our salary
		//rate * hoursPerWeek * weeksPerYear
		
		
		
		
		
	}

}
