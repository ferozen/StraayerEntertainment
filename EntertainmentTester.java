package Entertainment;

import java.util.Scanner;

public class EntertainmentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Entertainment tester v1.2");
		System.out.println("Choose the type of entertainment you would like to create: ");
		System.out.print(" (1) Rockband ");
		System.out.println();
		System.out.print("Enter selection: ");
		int selection = keyboard.nextInt();
		
		if (selection == 1) {
			editRockband();
		}
		
		
		
		
	}

	private static void editRockband() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Choose a title of your rockband: ");
		String name = keyboard.next();
		
		System.out.print("Choose how much your rockband makes in a year: ");
		double income = keyboard.nextDouble();
		
		RockBand cband = new RockBand(name,income);
		
		System.out.print("Set your band's genre: ");
		String genre = keyboard.next();
		
		cband.setGenre(genre);
		
		System.out.print("Set the city your band is from: ");
		String city = keyboard.next();
		
		cband.setCity(city);
		
		System.out.println();
		System.out.println("Here is what your band looks like: ");
		
		System.out.print("Name: " + cband.toString() + "\r");
		
		
		System.out.print("Annual Income: " + cband.getAnnualIncome() + "\r");
		
		
		System.out.print("Genre: " + cband.getGenre() + "\r");
		
		
		System.out.print("City: " + cband.getCity() + "\r");
		
		System.out.print("Would you like to create a new CD? [y/n]:  ");
		String cdchoice = keyboard.next();
		
		if ( cdchoice.equals("y")) {
		System.out.println();
		System.out.println("Let's make a new CD! ");
		System.out.print("What would you like to name the CD? : ");
		String cdname = keyboard.next();
		System.out.print("\r");
/*		
		System.out.print("At which studio was this recorded? : ");
		String cdstudio = keyboard.next();
		System.out.print("\r");
		
		System.out.print("How long is this CD? :  ");
		String cdlength = keyboard.next();
		
		System.out.print("\r");
*/
		
		String cdstudio = "Test studio";
		String cdlength = "21";
		
		cband.addCD(cdname,cdstudio,cdlength);
		
		System.out.println();
		System.out.println("Your CD has been created! ");
		}
		else {
		}
		
		System.out.print("Would you like to get the current list of Rockband CDs? [y/n]: ");
		String choice2 = keyboard.next();
		
		
		if ( choice2.equals(choice2) ) {
			
			System.out.println("Current list of CDs: ");
			String[] cdlist = cband.getListofCDs();
			
			for (int i=0; i<cdlist.length; i++) {
				System.out.println(cdlist[i]);
			}
				
		}
	
		else {
		}
		
		
	}


}
