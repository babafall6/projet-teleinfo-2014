package exo4;

public class Pigeon extends Animal implements Domestique {
	private String utilite;
	private String abri;

	public Pigeon() {
		// TODO Auto-generated constructor stub
	}
	public Pigeon(String utilite, String abri) {
		// TODO Auto-generated constructor stub
		this.utilite=utilite;
		this.abri=abri;
		
	}
	public void afficher(){
		super.utilite();
			System.out.print(""+utilite);
		super.abri();
			System.out.println(""+abri);
	}
	@Override
	public void abri() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void utilite() {
		// TODO Auto-generated method stub
		
	}
		



}

