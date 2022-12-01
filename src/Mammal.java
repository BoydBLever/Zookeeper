public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return this.energyLevel;
	}

	public int changeEnergy(int amt){
		return this.energyLevel += amt;
	}
}
