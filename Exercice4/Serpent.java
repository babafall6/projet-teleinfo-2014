package Exercice4;

public class Serpent extends Animal implements Sauvage{

	void criez(){
		System.out.println("Je siffle...");
	}
	void manger(){
		System.out.println("je suis un canovore...");
	}
	void seReproduire(){
		System.out.println("je ponds...");
	}
	
	public void abri(){
		System.out.println("Je vis dans la foret...");
	}
	public void chasse(){
		System.out.println("Je chasse les autres ranpants...");
	}
}
