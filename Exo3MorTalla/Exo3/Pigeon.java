package Exo3;
public class Pigeon extends Animal{
	private String crier;
	private String manger;
	private String seReproduire;

	public Pigeon() {
		// TODO Auto-generated constructor stub
	}
	public Pigeon(String crier, String manger, String seReproduire) {
		// TODO Auto-generated constructor stub
		this.crier=crier;
		this.manger=manger;
		this.seReproduire=seReproduire;
		
	}
	public void afficher(){
		super.crier();
			System.out.println(""+crier);
		super.manger();
			System.out.println(""+manger);
		super.seReproduire();
			System.out.println(""+seReproduire);
	}
		

}
