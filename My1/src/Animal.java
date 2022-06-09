
public class Animal implements Info{
		public int age;
		public String name;
		
		public Animal() {
			
		}
		
		
		public Animal (int age) {
			this.age = age;
		}
		
		public Animal (int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		public static void allData(int age, String name){
			System.out.println(age + "-" + name);
		}
		
		public void live () {
			System.out.println("livingshort");
		}
		
		
				
		public void ageCount ( ) {
			System.out.println(this.age);
		}
}
