public class Mammal {
	//Declare the energyLevel variable
	private int energyLevel;
	
	public Mammal() {
	//Assign the energyLevel variable	
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
