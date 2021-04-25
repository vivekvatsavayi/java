//for git - 25 april
package basics;

public class Cities {

	public static void main(String[] args) {
		//declare and define an array
		//in java [] means array
		String[] cities ={"New York", "Hyderabad", "Dallas"}; //implicitly defining the size
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		
		//Declare an array
		String[] countries;
		//define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "India";
		countries[2] = "Thailand";
		System.out.println(countries[1]);
		
		System.out.println("**********************");
		//Declare & define the array (only the size)
		
		String[] states = new String[5]; //explicitly defining the size
		states[0] = "Andhra";
		states[1] = "Telangana";
		states[2] = "Odisha";
		states[3] = "Karnataka";
		states[4] = "Bihar";
		int i = 0;
		
		//do loop enters the loop THEN tests condition 
		do {
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		} while(i < 5);
		
		// While loop: tests condition first then enters loop
		
		int n = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Karnataka") {
			System.out.println("STATE FOUND !");
			stateFound = true;
			}
			n++;
			
		}
		
		System.out.println("\nPrinting with for loop");
		
		//For loop: best structure for iterating through an array
		
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
			
		
		}
		}
}
