import java.util.Scanner;

public class Etudiant {
	int idEtudiant;
	public void setIdEtudiant (int id)
	{
		this.idEtudiant = id;
	}
	
	public int getIdEtudiant()
	{
		return idEtudiant;
	}
	
	public void faireCours(String nomMatiere)
	{
		System.out.println ("Etudiant " +idEtudiant+ " suis le cour de " +nomMatiere);
	}
	
	public void subirEvaluation(String nomMatiere )
	{
		System.out.println ("Etudiant " +idEtudiant+ " subit une evaluation de " +nomMatiere);
	}
	
	public static void main(String args[])
	{
		Etudiant etud = new Etudiant();
		int id;
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez l'Id de l'étudiant: ");
		id = sc.nextInt();
		etud.setIdEtudiant(id);
		
		System.out.println("Affichage des informations de l'étudiant-------------");
		System.out.println("Identifiant: "+etud.getIdEtudiant());
		etud.faireCours("Mathématiques");
		etud.subirEvaluation("Administration Linux");
		
	}
	
	

}
