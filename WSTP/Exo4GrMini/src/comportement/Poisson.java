package comportement;

import comportement.inter.Domestique;
import comportement.inter.Sauvage;

public class Poisson implements Domestique,Sauvage {

	public void abri() {
		System.out.println("ocean");

	}

	public void chasse() {
		System.out.println("Chasser : non");
		
	}

}
