// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

import java.util.Scanner;

public class EntertainmentTester {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Entertainment tester v1.4");
		System.out.println("Choose the type of entertainment you would like to create: ");
		System.out.print(" (1) Rockband ");
		System.out.print(" (5) Chamber Orchestra ");
		System.out.println();
		System.out.print("Enter selection: ");
		int selection = keyboard.nextInt();
		
		if (selection == 1) {
			editRockband();
		}
		else if (selection == 5) {
			editChamberOrchestra();
		}
		
	}

	private static void editRockband() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Choose a title of your rockband: ");
		String name = keyboard.next();
		
		System.out.print("Choose the genre of your rockband: ");
		String genre = keyboard.next();
		
		RockBand newband = new RockBand(name,genre);
		
		
		System.out.print("Set the city your band is from: ");
		String city = keyboard.next();
		
		newband.setCity(city);
		
		System.out.println();
		System.out.println("Here is what your band looks like: ");
		
		System.out.print("Name: " + newband.toString() + "\r");
		
		
		System.out.print("Annual Income: " + newband.getAnnualIncome() + "\r");
		
		
		System.out.print("Genre: " + newband.getGenre() + "\r");
		
		
		System.out.print("City: " + newband.getCity() + "\r");
		
		System.out.print("Would you like to create a new CD? [y/n]:  ");
		String cdchoice = keyboard.next();
		
		if ( cdchoice.equals("y")) {
		System.out.println();
		System.out.println("Let's make a new CD! ");
		System.out.print("What would you like to name the CD? : ");
		String cdname = keyboard.nextLine(); 
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
		
		newband.addCD(cdname,cdstudio,cdlength);
		
		System.out.println();
		System.out.println("Your CD has been created! ");
		}
		else {
		}
		
		System.out.print("Would you like to get the current list of Rockband CDs? [y/n]: ");
		String choice2 = keyboard.next();
		
		
		if ( choice2.equals(choice2) ) {
			
			System.out.println("Current list of CDs: ");
			String[] cdlist = newband.getListofCDs();
			
			for (int i=0; i<cdlist.length; i++) {
				System.out.println(cdlist[i]);
			}
				
		}
	
		else {
		}
	}

	private static void editChamberOrchestra() {
		ChamberOrchestra coolguys = new ChamberOrchestra("Amran's orchestra","Nice City",4);
		
		coolguys.setInstrumentList(new String[]{ChamberOrchestra.VIOLA,ChamberOrchestra.CELLO,ChamberOrchestra.VIOLIN,ChamberOrchestra.VIOLA});
		
		String[] C = coolguys.getInstrumentList();
		
		for( int i = 0; i < C.length; i++) {
			// Readnum provides a more readable number
			int readnum = i +1; 
			System.out.println("Instrument " + readnum + ": " + C[i]);
		}
		
	}

}
