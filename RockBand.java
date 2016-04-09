package Entertainment;

import java.util.ArrayList;
import java.util.List;

public class RockBand extends Entertainment implements Recordable, Broadcast {
	// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
	private String genre;
	private String city;
	
	public static ArrayList<CDRecording> CDlist = new ArrayList<CDRecording>();
	public static ArrayList<aBroadcast> Broadcastlist = new ArrayList<aBroadcast>();
	
	public RockBand(String name, double annualIncome){
		
		this.setName(name);
		this.setAnnualIncome(annualIncome);
		
	}

	public String getGenre() {
		return genre;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	
	public void addCD(String name, String studio, String length) {
		
		CDRecording newCD = new CDRecording(name, studio, length);
		CDlist.add(newCD);
		
		System.out.println("CD added");
		
	}

	
	public String[] getListofCDs() {
		
		//CDRecording.getCDArray();
		
		String[] a = CDlist.toArray(new String[CDlist.size()]);
		
		System.out.println("CD list gotten");
		
		return a;
		
	}

	
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

}










































































































