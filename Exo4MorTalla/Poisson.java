package exo4;

public class Poisson extends Animal implements Domestique {
	private String utilite;
	private String abri;

	public Poisson() {
		// TODO Auto-generated constructor stub
	}
	public Poisson(String utilite, String abri) {
		// TODO Auto-generated constructor stub
		this.utilite=utilite;
		this.abri=abri;
			
		}
		public void afficher(){
			super.utilite();
				System.out.print(""+utilite);
			super.abri();
				System.out.print(""+abri);
		}


}
