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
		}
		
		public String toString(){
			return broadcastInfo;
			
		}
}
