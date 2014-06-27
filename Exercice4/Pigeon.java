package Exercice4;

public class Pigeon extends Animal implements Sauvage{

	protected void criez(){
		System.out.println("Je roucoule...");
	}
	protected void manger(){
		System.out.println("je suis un herbivore...");
	}
	protected void seReproduire(){
		System.out.println("je ponds...");
	}
	
	public void abri(){
		System.out.println("Je vis dans une petite case...");
	}
	public void chasse(){
		System.out.println("Je chasse les fourmis...");
	}
	
}
