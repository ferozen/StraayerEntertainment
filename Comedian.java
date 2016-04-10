// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class Comedian extends Entertainment implements Recordable, Broadcastable {
	
	private String city;
	private boolean raciness=false;
	
	
	public Comedian(String name, boolean raciness){
		this.setName(name);
		this.raciness=raciness;
		this.setAnnualIncome(40000);
		
	}
	
	
// Interface methods required for Recordable and Broadcast
	
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

	// Broadcast methods work the same as the ones explained above
	public void addBroadcast(String time, String station) {
		
		aBroadcast newBroadcast = new aBroadcast(time, station);
		Broadcastlist.add(newBroadcast);
		System.out.println("Broadcast added!");
	}
	
	public String[] getListOfBroadcasts() {
		
		String[] b = CDlist.toArray(new String[CDlist.size()]);
		System.out.println("Broadcast list gotten!");

		return b;
		
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
