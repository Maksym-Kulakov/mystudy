public class Kata5
 {
  public static int squareSum(int[] n)
  { 
    int count = 0;
    for (int i = 0; i < n.length; i++) {
         count += (n [i] * n [i]); 
    }
    return count;
    
  }
  
  public static void main(String[] args) {
	int [] p = {1, 2};
	  int d = Kata5.squareSum(p);
	  System.out.println(d);
}
  
 }