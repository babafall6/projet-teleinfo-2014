package Exercice3;

public class EssaiAnimaux {

	public static void main(String[] args) {
		
		System.out.println("*Instance de la classe Chien*");
		Chien ch = new Chien();
		ch.criez();
		ch.manger();
		ch.seReproduire();
		
		System.out.println("=================================");
		
		System.out.println("*Instance de la classe Poisson*");
		Poisson p = new Poisson();
		p.criez();
		p.manger();
		p.seReproduire();
		
		System.out.println("=================================");
		
		System.out.println("*Instance de la classe Pigeon*");
		Pigeon pi = new Pigeon();
		pi.criez();
		pi.manger();
		pi.seReproduire();
		
		System.out.println("=================================");
		
		System.out.println("*Instance de la classe Serpent*");
		Serpent s = new Serpent();
		s.criez();
		s.manger();
		s.seReproduire();
		
		 
	}

}
