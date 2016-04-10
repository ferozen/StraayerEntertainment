// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class ChamberOrchestra extends Entertainment implements Recordable {
	
	private String name;
	private String city;
	private int numberOfSeats;
	public static final String VIOLIN = "Violin";
	public static final String VIOLA= "Viola";
	public static final String CELLO = "Cello";
	public static final String FLUTE = "Flute";
	
	String[] instrumentList = new String[0];
	
	//Creating arraylists for cds and broadcasts
	public static ArrayList<CDRecording> CDlist = new ArrayList<CDRecording>();

	
	public ChamberOrchestra(String name, String city, int numberOfSeats) {
		this.setName(name);
		this.city=city;
		this.numberOfSeats = numberOfSeats;
		this.instrumentList = new String[numberOfSeats];
		this.setAnnualIncome(30000);
	}

// Interface methods	
	
	public void addCD(String name, String studio, String length) {
		// Creating a newCD from CDRecording class
		CDRecording newCD = new CDRecording(name, studio, length);
		// Adding CD to the list
		CDlist.add(newCD);
		System.out.println("CD added");
	}
	
	public String[] getListofCDs() {
		// Converts arraylist to string
		String[] a = CDlist.toArray(new String[CDlist.size()]);
		System.out.println("CD list gotten");
		
		return a;
	}


// Getters and setters
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String[] getInstrumentList() {
		return instrumentList;
	}

	public void setInstrumentList(String [] a) {
		
		
		instrumentList = a;
/*		for (int i=0; i<CDlist.size(); i++) {
			 System.out.println(a[i]);
		 }*/
		
	}
	
	
	
}

