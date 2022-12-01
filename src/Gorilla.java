public class Gorilla extends Mammal {
	//employ a constructor
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("The gorilla likes bananas.");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("The gorilla climbed a tree.");
		energyLevel -= 10;
	}
}
