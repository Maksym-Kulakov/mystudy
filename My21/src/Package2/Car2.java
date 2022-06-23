package Package2;

public class Car2 {
	
	private Eng2 engine;
	
	Car2(Eng2 engine){
		this.engine = engine;
	}

	
	public void move() {
		if(engine != null) {
			engine.work();
			System.out.println("Car moving");
		}
	}
	}