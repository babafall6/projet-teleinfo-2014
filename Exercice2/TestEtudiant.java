package Exercice2;
import java.util.Scanner;


public class TestEtudiant {

	public static void main(String[] args) {
			
		Etudiant et = new Etudiant(1);
		System.out.println("Donnez la mati�re � faire cours ?");
		Scanner mat = new Scanner(System.in);
		String matiere = mat.nextLine();
		et.faireCours(matiere);
		
		System.out.println("Donnez la mati�re � faire �valuation ?");
		Scanner sbr = new Scanner(System.in);
		String subir = mat.nextLine();
		et.subirEvaluation(subir);
		
		
		EtudiantBoursier etu = new EtudiantBoursier(1, 18000);
		System.out.println("Donnez le taux de la bourse de l'�tudiant ?");
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		int res = var/100;
	    etu.percevoirBourse(res);
		

	}

}
