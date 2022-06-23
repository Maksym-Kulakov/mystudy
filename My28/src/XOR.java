public class XOR {
    
    public static boolean xor(boolean a, boolean b) {
        boolean result = false;
        if (a == false & b == false) {
          result = false;
        } else if (a == true & b == false) {
          result = true;
        } else if (a == false & b == true) {
          result = true; 
        } else if (a == true & b == true) {
             result = false;
        }
      
        return result;
    }
    
    public static void main(String[] args) {
    	boolean c = XOR.xor(true, true);
    	System.out.println(c);
	}
    
}