

public class Main {
	
	public void someMethod () {
		
	}
	
	class SomeInside2 extends Main{
		
		class SomeInside3 extends SomeInside2{
			
			class SomeInside4 extends SomeInside3{
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
// incorrect object creating as inner class in the outer class static method
		
//		Main.SomeInside2.SomeInside3.SomeInside4 some = new Main.SomeInside2.SomeInside3.SomeInside4();  

		
		
	}
	
}
