
public class Main {

	public static void main(String[] args) {

	 
		
		
		int value = outPut(new Triangular());
 		
		int value2 = outPut(new Circle());
		
		
 
		
		
		if ((value + value2) > 12) {
			System.out.println("circle and 3gular");
		}else if((value + value2) < 12) {
			System.out.println("circle only");
		}
		
		 
		
	

	}

	public static int outPut (Shape shape) {
		 return shape.numOfAngles();
	 }
	
}
