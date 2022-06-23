import java.util.List;

public class Animal {
	
	List<Dog> dogs;
	
	Animal(){
		
	}
	
	Animal (List<Dog> dogs){
		this.dogs = dogs;
	}
	
	
	public void somePrint() {
		System.out.println("somePrint");
	}
}
