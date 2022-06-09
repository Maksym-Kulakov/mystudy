
public class Animal {
	
	private static String compName = "zoo";
	
	private String name;  // = null
	
	private Cat mycat;  // = null
	
	
	public Animal () {
		
	}



	
	// constructor with parameter as object of other Class
	
	public Animal (String name, Cat mycat) {
			this.name = name;
			this.mycat = mycat;
		
}
	
		// get & set for name
		
		public void setName	(String name) {
			this.name = name;
		}
	
		public String getName () {
			return name;
		}
	
		// get & set for mycat
		
		public void setMyCat (Cat mycat) {
			this.mycat = mycat;
		}
		
		public Cat getMyCat () {
			return mycat;
		}
		
		// constructor with parameter as argument for other object creating

		public Animal (String name, int age) {
			this.name = name;
			mycat = new Cat (age);
		}
}
