
public class Animal {
	
	public String persname = "Bily";
	public static String stpersname = "Billy forever";
	
	
	public void demonstrateCat (Cat obj) {
		String addname = "fmMethod";    // field in method and can not be observer in another method
		obj.setName(persname + addname);   //field "persname" can be used as it`s with object working
		System.out.println(obj.getName());
	}
	
	
	public static void stDemonstrateCat (Cat obj) {
		obj.setName(stpersname);
		System.out.println(obj.getName());
	}
	
}
