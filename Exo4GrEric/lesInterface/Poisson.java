package lesInterface;

import lesInterface.Sauvage;

public class Poisson extends Animal implements Sauvage{
public String crier() {
		
		return "rien";
	}

	@Override
	public String manger() {
		// TODO Auto-generated method stub
		return "omnivore";
	}

	@Override
	public String seReproduit() {
		// TODO Auto-generated method stub
		return "pondre";
	}

	public String abri() {
		// TODO Auto-generated method stub
		return "mer";
	}

	public String chasse() {
		// TODO Auto-generated method stub
		return "p�cher";
	}

}
