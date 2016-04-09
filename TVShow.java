package Entertainment;

public class TVShow extends Entertainment implements Broadcast{
	// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
	
	private String network;
	private String genre;
	
	
	
	public void scheduleBroadcast() {
		// TODO Auto-generated method stub
		
	}

	public TVShow(String name, double annualIncome) {
		
		name = "TVShow";
		annualIncome = 1000000;
		this.setName(name);
		this.setAnnualIncome(annualIncome);
	}
	

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void addBroadcast(String time, String station) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getListOfBroadcasts() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
