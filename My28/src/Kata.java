public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    boolean val;
    if (distanceToPump / mpg >= fuelLeft) {
      val = true;
    } else {
      val = false;
    }
    return val;
  }
  

  
  public static void main(String[] args) {
	  System.out.println(Kata.zeroFuel(50, 25, 2));
}
  
  
}