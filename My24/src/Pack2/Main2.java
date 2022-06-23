package Pack2;

import Pack1.*;

public class Main2 {
	
	
	
	public static void main(String[] args) {
		Main1 someObj = new Main1();
		someObj.a = 2; // as field is public in other class of other Package
		someObj.setB(3); // as method is public in other class of other Package
	//	someObj.d;  // not available as only in Package (same as Default) and + in extended classes (see Child)
		
	}
	 
	
}
