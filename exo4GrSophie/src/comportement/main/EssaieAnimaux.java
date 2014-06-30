package comportement.main;

import comportement.Chien;
import comportement.Pigeon;
import comportement.Poisson;
import comportement.Serpent;

public class EssaieAnimaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("********** Chien ");
		Chien chien =new Chien();
		chien.abri();
		chien.chasse();
		
		System.out.println("");
		System.out.println("********** pigeon ");
		Pigeon pigeon =new Pigeon();
		pigeon.abri();
		pigeon.chasse();
		
		System.out.println("");
		System.out.println("********** Poisson ");
		
		Poisson poisson =new Poisson();
		poisson.abri();
		poisson.chasse();
		
		System.out.println("");
		System.out.println("********** Serpent ");
		Serpent serpent =new Serpent();
		serpent.abri();
		serpent.chasse();
	}

}
