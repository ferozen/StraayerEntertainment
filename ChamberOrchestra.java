// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class ChamberOrchestra extends Entertainment implements Recordable {
	// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
	
	private String name;
	private String city;
	private int numberOfSeats;
	
	public ChamberOrchestra(String name, String city, int numberOfSeats) {
		this.setName(name);
		this.city=city;
		this.numberOfSeats = numberOfSeats;
		
	}

// Interface methods	
	
	public void addCD(String name, String studio, String length) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] getListofCDs() {
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
	
	
	
}

