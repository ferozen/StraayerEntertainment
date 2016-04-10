// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

import java.util.ArrayList;
import java.util.List;

public class RockBand extends Entertainment implements Recordable, Broadcastable {

	// Defining class variables
	private String genre;
	private String city;
	
	//Creating arraylists for cds and broadcasts
	public static ArrayList<CDRecording> CDlist = new ArrayList<CDRecording>();
	public static ArrayList<aBroadcast> Broadcastlist = new ArrayList<aBroadcast>();
	
	
	public RockBand(String name, String genre) {
		
		this.genre = genre;
		this.setName(name);
		
	}
	
	
// Interface methods required for Recordable and Broadcast
	
	public void addCD(String name, String studio, String length) {
		// Creating a newCD from CDRecording class
		CDRecording newCD = new CDRecording(name, studio, length);
		// Adding CD to the list
		CDlist.add(newCD);
		System.out.println("CD added");
	}
	
	public CDRecording[] getListofCDs() {
		// Converts arraylist to string
		CDRecording[] a = CDlist.toArray(new CDRecording[CDlist.size()]);
		System.out.println("CD list gotten");
		
		return a;
	}

	// Broadcast methods work the same as the ones explained above
	public void addBroadcast(String time, String station) {
		
		aBroadcast newBroadcast = new aBroadcast(time, station);
		Broadcastlist.add(newBroadcast);
		System.out.println("Broadcast added!");
	}
	
	public aBroadcast[] getListOfBroadcasts() {
		
		aBroadcast[] b = Broadcastlist.toArray(new aBroadcast[Broadcastlist.size()]);
		System.out.println("Broadcast list gotten!");

		return b;
		
	}
	

// Main getters and setters

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
	
	@Override
	public String toString() {
		return super.toString();
	}
	




}










































































































