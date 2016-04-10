// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class Movie extends Entertainment implements Broadcastable {
	// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
	
	private String director;
	private String studio;
	private String info;
	
	public Movie(String name) {
		this.setName(name);
		this.info = "Name: " + name + "| Director: " + director + "| Studio: " + studio;
	}
	
	
// Interface methods

	public void addBroadcast(String time, String station) {
		
	}
	
	public aBroadcast[] getListOfBroadcasts() {
		
		return null;
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

	public String toString(){
		return info;
	}
	
	
	
	
	
	
}
