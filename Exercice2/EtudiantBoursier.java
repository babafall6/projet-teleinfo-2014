package Exercice2;

public class EtudiantBoursier extends Etudiant{
	private float tauxBourse;
	
	public EtudiantBoursier(int id, float tauxB){
		super(id);
		tauxBourse = tauxB;
	}
	
	public float getTauxBourse() {
		return tauxBourse;
	}
	public void setTauxBourse(float tauxBourse) {
		this.tauxBourse = tauxBourse;
	}
	
	public void percevoirBourse(float bour){
		tauxBourse = bour;
		if(this.tauxBourse <= 0.50){
			System.out.println("Je percois un demi bourse...");
		}else{
			System.out.println("Je percois une bourse entière...");
		}
	}

}
