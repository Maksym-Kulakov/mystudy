
public interface Messenger extends Apple{
	
	 		public void sendMessage();

	 		public void getMessage();
	 		
	 		public default void start() {					// already defined method
	 			System.out.println("started");
	 		}
	 		
}
