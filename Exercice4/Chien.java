package Exercice4;

public class Chien extends Animal implements Domestique{
	
	protected void criez(){
		System.out.println("J'aboie...");
	}
	protected void manger(){
		System.out.println("je suis un carnivore...");
	}
	protected void seReproduire(){
		System.out.println("je mets bas...");
	}
	
	public void utilite(){
		System.out.println("Je garde la maison...");
	}

}
