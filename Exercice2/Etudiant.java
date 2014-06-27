package Exercice2;

public class Etudiant {
	private int idEtudiant;
	
	
	public Etudiant(){}
	
	public Etudiant(int idEtu){
		idEtudiant = idEtu; 
	}
	
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	
	public void faireCours(String matiere){
		String str = matiere;
		
		System.out.println("je fais cours de "+ str);
	}
	public void subirEvaluation(String matiere){
		String str = matiere;
		
		System.out.println("je suis une évaluation sur "+ str);
	}

	
}
