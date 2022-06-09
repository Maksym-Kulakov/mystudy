
public class Main {
	public static void main(String[] args) {
	
		// Anonym class (with "implements") as subclass of Interface	
		Inter s = new Inter() {
			@Override
			public void intermethod() {
				System.out.println("i am from interface");	
			}
		};
		
		s.intermethod();
		
	// Anonym class (with "extended") as subclass of Abstract class	
		General p = new General() {

			@Override
			void some() {
				System.out.println("i am from Abstract class");
				
			}
			
		};
		
		p.some();
		
	// Anonym class (with "extended") as subclass of Parent class	
		
		Usual r = new Usual () {
			@Override
			public void norm() {
				System.out.println("I am from parent Class");
			}
		};
		
		r.norm();
		
	}
}
