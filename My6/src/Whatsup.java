
abstract public class Whatsup implements Messenger, Application {

	@Override	
	public void sendMessage() {								//method fm Messenger
		System.out.println("send in Whatsup");
		
	}

	@Override
	public void getMessage() {								//method fm Messenger
		System.out.println("rcvd in Whatsup");
		
	}

//	@Override
//	public void runSystem() {								//method fm Application
////		System.out.println("run W");
//		
//	}

	@Override					
	public void common(int one, int two) {					//Method fm Apple
		System.out.println(one/two+SOME_VAR);
		
	}

}