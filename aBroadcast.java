// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class aBroadcast {

	String time;
	String station;
	String broadcastInfo;
	
		public aBroadcast(String time, String station) {
			this.time = time;
			this.station = station;
			this.broadcastInfo = time + ", " + station;
			
			System.out.print("Your broadcast has been created!");
			System.out.println();
			System.out.println("The new broadcasts's info has been listed below");
			System.out.println("Time: " + time);
			System.out.println("Station: " + station);
			System.out.println();
		}
		
		public String toString(){
			return broadcastInfo;
			
		}
}
