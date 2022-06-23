
final class Car {
	
	private final Engine engine;
	
	Car(Engine engine){
		this.engine = engine;
	}
	
	public void move () {
		engine.work();
		System.out.println("Car moving");
	}
}

