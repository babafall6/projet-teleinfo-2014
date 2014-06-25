package comportementsAnimal;

import lesInterface.Sauvage;

public class Serpent extends Animal implements Sauvage{
public String crier() {
		
		return "siffler";
	}

	@Override
	public String manger() {
		// TODO Auto-generated method stub
		return "carnivore";
	}

	@Override
	public String seReproduit() {
		// TODO Auto-generated method stub
		return "pondre";
	}

	public String abri() {
		// TODO Auto-generated method stub
		return "foret";
	}

	public String chasse() {
		// TODO Auto-generated method stub
		return "chasser";
	}

}
