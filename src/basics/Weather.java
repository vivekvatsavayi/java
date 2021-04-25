//if - else statements are conditional logic statements or decision making statements
//9
package basics;
//for git - 25 april
public class Weather {
	public static void main(String[] args) {
		//this program will give suggestions of what to wear based on the temperature and sun condition
		
		
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		}
		
		else if((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("Its a little cooler perhaps wear jacket and jeans.");
			System.out.println("Wear a hat to keep sun out of your eyes");
		}
		else if ((temperature > 50 ) || (sunCondition == "Overcast")) {
			System.out.println("This is cool day make sure to wear warm clothes");
			
		}
		else {
			System.out.println("Looks like a cold day bring a big jacket.");
		}
		System.out.println("The program is ending");
	}

}
