// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class TVShow extends Entertainment implements Broadcastable {
	// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
	
	private String genre;
	private String station;
	
	//Creating arraylists 
	
	public static ArrayList<aBroadcast> Broadcastlist = new ArrayList<aBroadcast>();
	

	public TVShow(String name, String station) {
		this.setName(name);
		this.setAnnualIncome(100000);
		this.station = station;
	}

// Interface methods
	
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
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	
	


	
}
