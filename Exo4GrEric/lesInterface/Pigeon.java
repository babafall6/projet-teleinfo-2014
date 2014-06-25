package lesInterface;

import lesInterface.Domestique;

public class Pigeon extends Animal implements Domestique{

    
	public String crier() {
		
		return "roucoulement";
	}

	@Override
	public String manger() {
		// TODO Auto-generated method stub
		return " omnivore";
	}

	@Override
	public String seReproduit() {
		// TODO Auto-generated method stub
		return "pondre";
	}

	public String utilite() {
		// TODO Auto-generated method stub
		return "nourriture, distraction";
	}

}
