package basics;
//for git - 25 april
public class Strings {
	public static void main(String[] args) {
		
		String bookTitle;
		String wordChoice = "bharat";
		bookTitle = "Mahabharata";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is Chrome");
			
		}
		
		String firstName = "Viv";
		String lastName = "Surya";
		String SSN = "9494945870";
		
		System.out.println("There are " + SSN.length() + " digits in the SSN");
		
		//Print initials and last 4 digits of ssn
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,3));
		System.out.print(SSN.substring(5));
		
	
	}

}
