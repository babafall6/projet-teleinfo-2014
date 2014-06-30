package exo2;

public class Etudiant {
	
private int idEtudiant;

	
	public Etudiant (int idEtudiant){
		this.idEtudiant = idEtudiant;		
		}
	
	public void faireCOURS(String nomMatiere)	
	 	{	 	
			String mat  = nomMatiere;
			System.out.println("L\'etudiant "+ idEtudiant +" fait la matiere " + mat);	
		}
	
	public void subirEaluation(String nomMatiere)
		{
			String mat  = nomMatiere;
		System.out.println(" JAI FAIS UNE EVALUATION DE "+mat+"");
	
		}
	public int getIdEtudiant()
		{
		return this.idEtudiant;
		}
	public void setidEtudiant(int idEtudiant)
		{
			this.idEtudiant= idEtudiant;
		}
			

}
