
public class Test {

	public static void main(String[] args) {
		
		Parent firstson = new Child("Nick", 5);
		
		Parent secondson = new Child("Ben", 2);
		
		Parent thirdson = new Child();
		
		Child fourthson = new Child();
		
		
		thirdson = Parent.passname(secondson);
		
		System.out.println(thirdson.name);
		
		
//		fourthson = Parent.passname(secondson);    // no possible as method gives out = Parent & fourthson = child & CAST can not help
		
	}
	
}
