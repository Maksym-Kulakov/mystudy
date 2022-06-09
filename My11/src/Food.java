
public interface Food extends Laden{
	
	int GOODTEMP = 15;
	
	public default void tempOfBody () {
		System.out.println(GOODTEMP);
	}
	
	public void eat ();
	
	public void drink();
	
	
}
