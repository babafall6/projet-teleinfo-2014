package comportement;

import comportement.inter.Domestique;
import comportement.inter.Sauvage;

public class Pigeon implements Domestique,Sauvage{

	public void abri() {
		System.out.println("cage");
	}

	public void chasse() {
		System.out.println("Chasser : non");
		
	}

}
