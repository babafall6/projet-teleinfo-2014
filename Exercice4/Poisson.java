package Exercice4;

public class Poisson extends Animal implements Sauvage{

	protected void criez(){
		System.out.println("Je roucoule comme un pigeon et se met subitement à crier comme un singe...");
	}
	protected void manger(){
		System.out.println("je suis un carnivore...");
	}
	protected void seReproduire(){
		System.out.println("je ponds...");
	}
	
	public void abri(){
		System.out.println("Je vis dans la mer...");
	}
	public void chasse(){
		System.out.println("Je chasse les petits poissons...");
	}

}
