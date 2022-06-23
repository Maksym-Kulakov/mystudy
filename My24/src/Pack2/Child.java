/*A protected member or constructor of an object may be accessed from outside the package in which it is 
 * declared only by code that is responsible for the implementation of that object.
 */


package Pack2;

import Pack1.Main1;

public class Child extends Main1 {
	
	
	
	public static void main(String[] args) {

		Child ch1 = new Child();
		ch1.d = 3;               //can be reached only because "protected" field (default "c" is no possible)
		
		
	}
	
	
}
