package my2;

public abstract class Unkle {
  
	private String name;
	
	public Unkle (String name) {
		this.name = name;
	}
	
	
	
	public String getName () {
		return name;
	}
	
	public abstract void display (); 
 
	
}
