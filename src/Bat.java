public class Bat extends Mammal {

	private int energyLevel = 300;
	
	public void fly() {
		System.out.println("Flutter flutter swoosh");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("so, well nevermind!");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("ROARING FIRE!");
		energyLevel -= 100;
	}
	
}