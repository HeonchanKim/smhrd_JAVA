package Toy;

public class ToyMain {
	public static void main(String[] args) {
		
		RandomToyMachine rtm = new RandomToyMachine();
		
		rtm.addToy(new Train());
		rtm.addToy(new Ball());
		rtm.addToy(new Gun());
		
		rtm.getToy().play();
		
	}
}
