// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class Comedian extends Entertainment implements Recordable, Broadcastable {
	
	private String city;
	private boolean raciness=false;
	private String info;
	
	public Comedian(String name, boolean raciness){
		this.setName(name);
		this.raciness=raciness;
		this.info = "Name: " + name + "| City: " + city + "| Raciness: " + raciness;
	}

	
// Interface methods
	
	public void addBroadcast(String time, String station) {
		// TODO Auto-generated method stub
		
	}
	
	public aBroadcast[] getListOfBroadcasts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCD(String name, String studio, String length) {
		// TODO Auto-generated method stub
		
	}

	public CDRecording[] getListofCDs() {
		// TODO Auto-generated method stub
		return null;
	}

// Getters and setters 
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isRaciness() {
		return raciness;
	}

	public void setRaciness(boolean raciness) {
		this.raciness = raciness;
	}
	
	public String toString() {
		return info;
	}
	
}
