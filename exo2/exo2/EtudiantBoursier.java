import java.util.Scanner;


public class EtudiantBoursier extends Etudiant {
	float tauxBourse;
	public float getTauxBourse()
	{
		return tauxBourse;
	}
	public void setTauxBourse (int bours)
	{
		this.tauxBourse = bours;
	}

	public static void main(String args[])
	{
		EtudiantBoursier bourse = new EtudiantBoursier();
		int id;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Saisissez l'Id de l'�tudiant:  ");
		id = sc.nextInt();
		bourse.setIdEtudiant(id);
		
		System.out.println("Affichage des informations de l'�tudiant-------------");
		System.out.println("Identifiant: "+bourse.getIdEtudiant());
		bourse.faireCours("Math�matiques");
		bourse.subirEvaluation("Administration Linux");
		System.out.println("l'etudiant Est boursier");
	}
}
