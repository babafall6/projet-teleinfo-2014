package exo2;

public class EtudiantBoursier extends Etudiant {
	
	 private double tauxBourse;
	 
	 public EtudiantBoursier(int idEtudiant, Double tauxBourse ) {
		super(idEtudiant);
		this.tauxBourse = tauxBourse;
	 }


	public void pecevoirBourse(){
		System.out.println("L\'etudiant "+this.getIdEtudiant()+"recoit une bourse de "+tauxBourse);

	}

}
