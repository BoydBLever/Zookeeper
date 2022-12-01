public class Gorilla extends Mammal {
	public Gorilla(){
		//all the attributes and methods are extended to the Gorilla
		super(); 
	}
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		this.changeEnergy(-5);
	}
	public void eatBananas() {
		System.out.println("The gorilla likes bananas.");
		this.changeEnergy(10);
	}
	public void climb() {
		System.out.println("The gorilla climbed a tree.");
		this.changeEnergy(-10);
	}
}
