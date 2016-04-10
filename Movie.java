// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class Movie extends Entertainment implements Broadcastable {
	// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
	
	private String director;
	private String studio;
	
	//Creating arraylists for cds and broadcasts
	public static ArrayList<aBroadcast> Broadcastlist = new ArrayList<aBroadcast>();
	
	public Movie(String name) {
		this.setName(name);
		this.setAnnualIncome(200000);
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
	
	public String getDirector() {
		return director;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	
	
	
	
	
	
}
