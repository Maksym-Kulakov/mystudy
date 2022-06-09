

public class Main2 {
	
	public void someMethod () {
		System.out.println("hi fm super");
	}
	
	static class SomeInside2 extends Main2{
		
		static class SomeInside3 extends SomeInside2{
			
			static class SomeInside4 extends SomeInside3{
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
// Correct object creating as inner class in the outer class static method
		
 	Main2.SomeInside2.SomeInside3.SomeInside4 some = new Main2.SomeInside2.SomeInside3.SomeInside4();  
 	some.someMethod();

 //or without object naming
 	
 	new Main2.SomeInside2.SomeInside3.SomeInside4().someMethod();
 	
//overriding with anonymclass
 	
 	Main2.SomeInside2.SomeInside3.SomeInside4 someOther = new Main2.SomeInside2.SomeInside3.SomeInside4() {
 			@Override
 			public void someMethod () {
 				System.out.println("hi fm clast hild");
 			}
 	};
		someOther.someMethod();
	}
	
}
