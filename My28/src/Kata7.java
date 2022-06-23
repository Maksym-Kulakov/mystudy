
public class Kata7 {

	 public static int expressionsMatter(int a, int b, int c) {
	        // Your Code here... Happy Coding!
	       
	    int [] array = new int [6];
	    
	    array [0] = a * b * c;
	    array [1] = a * b + c;
	    array [2] = a + b * c;
	    array [3] = (a + b) * c;
	    array [4] = a * (b + c);
	    array [5] = a + b + c;
	    
	   int max = array [0];
	    
	    for (int i = 1; i < 6; i++) {
	    	if (max < array[i]) {
	    		max = array[i];
	    	}
	    }
	    
	    return max;
	    }
	
	 public static void main(String[] args) {
		System.out.println(Kata7.expressionsMatter(1, 8, 3));
		
	}
	 
}
