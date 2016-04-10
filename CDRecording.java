// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public class CDRecording {
	
	public String name;
	public String studio;
	public String length;
	public String CDinfo;
	
	public CDRecording(String name, String studio, String length) {
		this.name = name;
		this.studio = studio;
		this.length = length;
		this.CDinfo = name + ", " + studio + ", " + length;
		
		// Print this stuff
		System.out.print("Your CD has been created!");
		System.out.println();
		System.out.println("The new CD's info has been listed below");
		System.out.println("CD name: " + name);
		System.out.println("Recording studio name: " + studio);
		System.out.println("Length: " + length);
		
	}
	
	public String toString() {
		return CDinfo;
		
	}
	
	// Ignore below, unused code left for possible use in other parts. 
	
//	public void createCD(String name,String studio,String length) {
//		
//		List<String> CDlist = new ArrayList<String>();
//		
//		 CDlist.add(infoToString(name,studio,length));
//		 
//		
//		 System.out.println("CD \' " + CDlist.get(0) + " \' created");
//
//		 String[] a = CDlist.toArray(new String[CDlist.size()]);
//		 
//		 
//		 System.out.println("Current CD lists: ");
//		 for (int i=0; i<CDlist.size(); i++) {
//			 System.out.println(a[i]);
//		 }
//		
//	}
//	
//	public static String infoToString(String name,String studio,String length) {
//		String CDinfo = null;
//		
//		CDinfo = name + ", " + studio + ", " + length;
//		
//		System.out.println("Info written");
//		
//		return CDinfo;
//	}
//	
//	public static String[] getCDArray(List<String> CDlist) {
//		
//		String[] CDListArray = CDlist.toArray(new String[CDlist.size()]);
//		
//		return CDListArray;
//	}
 
   

}
