package comportement.main;

import comportement.Chien;
import comportement.Pigeon;
import comportement.Poisson;
import comportement.Serpent;

public class EssaiAnimaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("********** Chien ");
		Chien chien=new Chien();
		chien.crier();
		chien.manger();
		chien.seReproduire();
		System.out.println("");
		System.out.println("********** Serpent ");
		Serpent serpent= new Serpent();
		serpent.crier();
		serpent.manger();
		serpent.seReproduire();
		System.out.println("");
		System.out.println("********** Pigeon ");
		Pigeon pigeon= new Pigeon();
		pigeon.crier();
		pigeon.manger();
		pigeon.seReproduire();
		System.out.println("");
		System.out.println("********** Poisson ");
		Poisson poisson= new Poisson();
		poisson.crier();
		poisson.manger();
		poisson.seReproduire();

	}

}
