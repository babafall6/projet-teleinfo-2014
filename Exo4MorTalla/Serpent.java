package exo4;


public class Serpent extends Animal implements Domestique {

	private String chasse;
	

	public Serpent() {
		// TODO Auto-generated constructor stub
	}
	public Serpent(String chasse) {
		// TODO Auto-generated constructor stub

		this.chasse=chasse;
		
	}
	public void afficher(){
		
		super.chasse();
			System.out.println(""+chasse);
	}

}
