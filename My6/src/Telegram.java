
public class Telegram implements Messenger, Application {

	int number2 = 111;
	
	@Override
	public void sendMessage() {									//method fm Messenger
		System.out.println("send in Tel" + number2);
		
	}

	@Override
	public void getMessage() {								//method fm Messenger
		System.out.println("rcvd in Tel");
		
	}

	@Override
	public void runSystem() {								//method fm Application
		System.out.println("run T");
		
	}

	@Override
	public void common(int one, int two) {					//Method fm Apple
		System.out.println(one + two + SOME_VAR);
		
	}
	
	

}
