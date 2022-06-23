
public class Parent {
	
	String name;
	int age;
	
	Parent(){
		
	}
	
	Parent(String name, int age){
		this.name = name;
		this.age =age;
	}
	
	public static Parent passname (Parent parentin) {
		Parent parentout = new Parent();
		parentout.name = parentin.name;
		return parentout;
	}
	
}
