package basics;
//for git - 25 april
public class Factorial {

	public static void main(String[] args) {
		//Write a function that takes a value N and returns the sum of 1 to n
		System.out.println(sum(4));
		System.out.println("------------------");
		//Write a function that computes factorial -- use recursion
		System.out.println("Factorial: " + factorial(5));
		
		//Write 3 functions that return the min, avg and max of an array
		int[] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAvg(numbers));
	}
	
	public static int findAvg(int[] arr) {
		//Take sum, divide by number of elements
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum = sum + arr[i];		
		}
		System.out.println("Sum: " + sum);
		return sum/arr.length;
	}
	
	
	//if you want to return something dont use keyword void
	
	public static int findMin(int[] arr) {
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < min ) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max ) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		System.out.println(n);
		return factorial(n-1) * n;
	}
	
	
	
	
	
}
