
 public class Whatsup2 extends Whatsup {

	@Override	
	public void sendMessage() {								//method fm Messenger
		System.out.println("send in Whatsup");
		
	}

	@Override
	public void getMessage() {								//method fm Messenger
		System.out.println("rcvd in Whatsup");
		
	}

 

	@Override					
	public void common(int one, int two) {					//Method fm Apple
		System.out.println(one/two+SOME_VAR);
		
	}

	@Override
	public void runSystem() {
		// TODO Auto-generated method stub
		
	}

}