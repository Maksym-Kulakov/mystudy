
public class Main {

		
	public static void main(String[] args) {
		
		Apple ipo = new Apple () {                          // Anonym class (as virtual subclass) 

			@Override
			public void common(int one, int two) {			// methods from Apple & Application to be overrided
				System.out.println(one + two);
				
			}
			
		};
		
		ipo.common(4, 10);
		 
		Application imo = new Application () {											// Anonym class (as virtual subclass)

			@Override
			public void common(int one, int two) {										// methods from Apple & Application to be overrided
				System.out.println(one+two);
				
			}

			@Override
			public void runSystem() {
				System.out.println("Imo is run");
				
			}
			
		};
		
		imo.common(2, 5);                    //important to implement command as  before we only virtually created subclasses with overriding methods
		imo.runSystem();
		
		
		
		Apple.stCommon(1, 20);
		
		
		Messenger vibmaximus = new Viber ();     // tale methods only from Messenger (Apple is available)
		vibmaximus.start();
		vibmaximus.sendMessage();
		vibmaximus.getMessage();
		
		Application vibmaximus2 = new Viber ();     // tale methods only from Application (Apple is available)
		vibmaximus2.runSystem();
		 
		
		Viber vibmaximus3 = new Viber ();         // tale all methods (Apple is available)
		vibmaximus3.start();
		vibmaximus3.runSystem();
		vibmaximus3.getMessage();
		vibmaximus3.sendMessage();
		vibmaximus3.common(3, 3);
		
		
		Telegram telegram3 = new Telegram();					// method with parameters for input and argument from Apple - static final
		telegram3.common(3, 10);
		
		Messenger telegram2 = new Telegram ();					// method with parameters for input and argument from Apple - static final
		telegram2.common(2, 3);
		telegram2.sendMessage();                   //method coming fm class Messenger
		
		new Telegram().sendMessage();
		
		Telegram telegram4 = new Telegram();
		telegram4.sendMessage();
		
		telegram4.icon();
		
	}


	}


