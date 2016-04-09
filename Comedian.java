// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class Comedian extends Entertainment implements Recordable, Broadcastable {
	
	private String city;
	private boolean raciness=false;
	
	
	public Comedian(String name, boolean raciness){
		this.setName(name);
		this.raciness=raciness;
		
	}
	
	
// Interface methods
	
	public void addBroadcast(String time, String station) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] getListOfBroadcasts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCD(String name, String studio, String length) {
		// TODO Auto-generated method stub
		
	}

	public String[] getListofCDs() {
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
	
	
}
