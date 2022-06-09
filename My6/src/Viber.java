
public class Viber implements Messenger, Application {

	@Override
	public void sendMessage() {							//method fm Messenger
		System.out.println("send in Viber");
		
	}

	@Override
	public void getMessage() {						//method fm Messenger
		System.out.println("rcvd in Viber");
		
	}

	@Override
	public void runSystem() {						//method fm Application
		System.out.println("runV");
		
	}

	@Override	
	public void common(int one, int two) {				//Method fm Apple
		System.out.println(one*two*SOME_VAR);
		
	}

}