
public interface Apple {
	
	int SOME_VAR = 5;  // public static final  - в автомате
	
	public default void icon () {
		System.out.println("Apple");
	}
	
	public void common (int one, int two);			// method with arguments
	
	static void stCommon (int three, int four) {
		System.out.println("I am here as static" + SOME_VAR + three + four);    // static method - not to be overrided in subclasses
	}
	

}
