
package Exo3;
public class Serpent extends Animal{
	private String crier;
	private String manger;
	private String seReproduire;

	public Serpent() {
		// TODO Auto-generated constructor stub
	}
	public Serpent(String crier, String manger, String seReproduire) {
		// TODO Auto-generated constructor stub
		this.crier=crier;
		this.manger=manger;
		this.seReproduire=seReproduire;
		
	}
	public void afficher(){
		super.crier();
			System.out.print(""+crier);
		super.manger();
			System.out.print(""+manger);
		super.seReproduire();
			System.out.print(""+seReproduire);
	}
		

}