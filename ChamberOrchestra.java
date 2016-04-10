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
	
	public ChamberOrchestra(String name, String city, int numberOfSeats) {
		this.setName(name);
		this.city=city;
		this.numberOfSeats = numberOfSeats;
		this.instrumentList = new String[numberOfSeats];
	}
	
// Interface methods	
	
	public void addCD(String name, String studio, String length) {
		// TODO Auto-generated method stub
		
	}
	
	public CDRecording[] getListofCDs() {
		// TODO Auto-generated method stub
		return null;
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
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}

