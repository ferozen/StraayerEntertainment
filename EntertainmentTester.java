// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

import java.util.Scanner;

public class EntertainmentTester {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Entertainment tester v1.4");
		System.out.println("Choose the type of entertainment you would like to create: ");
		System.out.print(" (1) Rockband ");
		System.out.print(" (2) TVshow ");
		System.out.print(" (3) Movie ");
		System.out.print(" (4) Comedian ");		
		System.out.print(" (5) Chamber Orchestra ");
		System.out.println();
		System.out.print("Enter selection: ");
		int selection = keyboard.nextInt();
		
		if (selection == 1) {
			editRockband();
		}
		else if(selection == 2){
			editTVshow();
		}
		else if(selection == 3){
			editMovie();
		}else if(selection == 4){
			editComedian();
		}
		else if (selection == 5) {
			editChamberOrchestra();
		}
		
		
	}

	private static void editRockband() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Choose a title of your rockband: ");
		String name = keyboard.nextLine();
		
		System.out.print("Choose the genre of your rockband: ");
		String genre = keyboard.nextLine();
		System.out.print("Set the city your band is from: ");
		String city = keyboard.nextLine();
		
		
		RockBand newband = new RockBand(name,genre);
		newband.setCity(city);
		
		
		System.out.println();
		System.out.println("Here is what your band looks like: ");
		System.out.println("Name: " + newband.toString() + " | Genre: " + newband.getGenre() + " | City: " + newband.getCity());
		System.out.println();
		
		// addCD and Broad cast tests
		System.out.print("Would you like to create a new CD? [y/n]:  ");
		String cdchoice = keyboard.nextLine();
		
		while ( cdchoice.equals("y")) {
			
		System.out.println();
		System.out.print("What would you like to name the CD? : "); 
		String cdname = keyboard.nextLine(); 
		//System.out.print("\r");
		
		System.out.print("At which studio was this recorded? : ");
		String cdstudio = keyboard.nextLine();
		//System.out.print("\r");
		
		System.out.print("How long is this CD? :  ");
		String cdlength = keyboard.nextLine();
		//System.out.print("\r");

		
	//	String cdstudio = "Test studio";
	//	String cdlength = "21";
		
		System.out.println();
		newband.addCD(cdname,cdstudio,cdlength);
		
		System.out.println();
		System.out.print("Create another CD? ");
		cdchoice = keyboard.nextLine();
		
		}
		
		System.out.println();
		System.out.print("Would you like to get the current list of Rockband CDs? [y/n]: ");
		String choice2 = keyboard.nextLine();
		
		
		if ( choice2.equals("y") ) {
			
			System.out.println("Current list of CDs: ");
			CDRecording[] cdlist = newband.getListofCDs();
			System.out.println();
			for (int i=0; i<cdlist.length; i++) {
				System.out.println("Name: " + cdlist[i].name + " | Studio: " + cdlist[i].studio + " | Length: " + cdlist[i].length);
			}
				
		}
	
		System.out.println();
		System.out.print("Would you like to create a broadcast for " + name + "? [y/n]: ");
		String broadcastchoice = keyboard.nextLine();
		
		while ( broadcastchoice.equals("y")) {
			
			System.out.print("Which station will this broadcast be on? : ");
			String broadcaststation = keyboard.nextLine();
			//System.out.print("\r");
			
			System.out.print("What time will this broadcast be? :  ");
			String broadcasttime = keyboard.nextLine();
			
//		String broadcasttime = "5:30PM";
//		String broadcaststation = "Myfavoritestationever";
		
		newband.addBroadcast(broadcasttime, broadcaststation);
		
		System.out.println();
		System.out.println("Broadcast created! ");
		System.out.println();
		System.out.println("Create another broadcast? ");
		broadcastchoice = keyboard.nextLine();
		}
		
		System.out.println();
		System.out.print("Would you like to get the current list of Broadcasts? [y/n]: ");
		String choice3 = keyboard.nextLine();
		
		if ( choice3.equals("y") ) {
			
			System.out.println("Current list of Broadcasts: ");
			aBroadcast[] broadcastlist = newband.getListOfBroadcasts();
			System.out.println();
			for (int i=0; i<broadcastlist.length; i++) {
				System.out.println("Time: " + broadcastlist[i].time + " | Station: " + broadcastlist[i].station);
			}
				
		}
	
	}
	
	private static void editTVshow(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Choose a name of your TVshow: ");
		String name = keyboard.nextLine();
		
		System.out.print("Choose a station of your TVshow: ");
		String station = keyboard.nextLine();
		
		TVShow newTVshow=new TVShow(name,station);
		System.out.print("Set a genre of your TVshow: ");
		String  genre=keyboard.nextLine();
		newTVshow.setGenre(genre);
		System.out.println();
		System.out.println("Here is what your TVshow looks like: ");
		
		System.out.print("Name: " + newTVshow.toString() + "\r");
		
		System.out.print("Station: " + newTVshow.getStation()+ "\r");
	
		
		
		System.out.print("Genre: " + newTVshow.getGenre() + "\r");
		
		System.out.print("Annual Income: " + newTVshow.getAnnualIncome()+ "\r");
		
	}
	private static void editMovie(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Choose a name of your movie: ");
		String name = keyboard.nextLine();
		
		System.out.print("Choose the director of your movie: ");
		String director = keyboard.nextLine();
		
		
		Movie newmovie =new Movie(name);
		System.out.print("Choose the studio of your movie: ");
		String  studio=keyboard.nextLine();
		newmovie.setDirector(director);
		newmovie.setStudio(studio);
		System.out.println();
		System.out.println("Here is what your movie looks like: ");
		
		System.out.print("Name: " + newmovie.toString() + "\r");
		
		System.out.print("Director: " + newmovie.getDirector()+ "\r");
	
		
		
		System.out.print("Studio: " + newmovie.getStudio() + "\r");
		
		System.out.print("Annual Income: " + newmovie.getAnnualIncome()+ "\r");
	
	}
	private static void editComedian(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Choose a name of your comedian: ");
		String name = keyboard.nextLine();
		
		System.out.print("Choose the city of your comedian: ");
		String city = keyboard.nextLine();
		System.out.print("Is he/she raciness?(y/n)  ");
		String r = keyboard.nextLine();
		boolean raciness;
		if(r.equals("y")){
			raciness=true;
		}else{
			raciness=false;
		}
		
		Comedian newcom=new Comedian(name,false);
		String  studio=keyboard.nextLine();
		newcom.setCity(city);
		newcom.setRaciness(raciness);
		System.out.println();
		System.out.println("Here is what your movie looks like: ");
		
		System.out.print("Name: " + newcom.toString() + "\r");
		
		System.out.print("City: " + newcom.getCity()+ "\r");
	
		
		
		System.out.print("Raciness: " + newcom.isRaciness() + "\r");
		
		System.out.print("Annual Income: " + newcom.getAnnualIncome()+ "\r");
		
		}
	
		
		
	private static void editChamberOrchestra() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is the name of this Chamber Orchestra? : ");
		String name = keyboard.nextLine();
		
		System.out.print("Choose which city " + name + " plays in : ");
		String city = keyboard.nextLine();

		System.out.print("How many seats does " + name + "have? :  ");
		int seats = keyboard.nextInt();
		
		
		System.out.println("Which instruments occupy which seats? (Available instruments: ChamberOrchestra.(VIOLA, CELLO, VIOLIN, FLUTE)");
		String[] instruments = new String[seats];
		
		for ( int i = 0; i < instruments.length; i++ ) {
			int readnum = i + 1;
			System.out.print("Seat " + readnum + ": "); 
			String instrument = keyboard.next();
			instruments[i] = instrument;
		}
		
		ChamberOrchestra newO= new ChamberOrchestra(name,city,seats);
		newO.setInstrumentList(instruments);
		
		System.out.println();
		System.out.println("Here is what you're orchestra looks like: ");
		System.out.println(newO.toString());
		
		
		String[] C = newO.getInstrumentList();
		
		for( int i = 0; i < C.length; i++) {
			// Readnum provides a more readable number
			int readnum = i +1; 
			System.out.println("Instrument " + readnum + ": " + C[i]);
		}
		
	}
}
