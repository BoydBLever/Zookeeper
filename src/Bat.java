public class Bat extends Mammal {
	public Bat(){
		super();
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Flutter flutter swoosh");
		this.changeEnergy(-50);
	}
	
	public void eatHumans() {
		System.out.println("so, well nevermind!");
		this.changeEnergy(25);
	}
	
	public void attackTown() {
		System.out.println("ROARING FIRE!");
		this.changeEnergy(-100);
	}
	
}