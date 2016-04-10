// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class TVShow extends Entertainment implements Broadcastable {
	// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
	
	private String genre;
	private String station;
	private String info;
	

	public TVShow(String name, String station) {
		this.setName(name);
		this.setAnnualIncome(23231);
		this.station = station;
	}

// Interface methods
	
	public void addBroadcast(String time, String station) {
		// TODO Auto-generated method stub
		
	}
	
	public aBroadcast[] getListOfBroadcasts() {
		// TODO Auto-generated method stub
		return null;
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
