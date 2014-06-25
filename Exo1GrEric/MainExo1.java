import gestionEtudiant.Etudiant;
import gestionEtudiant.NoteNonValideExeption;

import java.util.Scanner;


public class MainExo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ct=0;
		char continu;
		Etudiant unEtudiant=new Etudiant("toto");
		do{
		try{
			ct=0;
			do{
		unEtudiant.ajouterNote();
		
				 do{
				System.out.println("voulez vous continuer?(o/n) ");
				continu=sc.nextLine().charAt(0);
				if(continu!='o'&&continu!='n')
					System.out.println("paramatre incorrect ");
				   }while(continu!='o'&&continu!='n');
			}while(continu=='o');
		}catch(NoteNonValideExeption NNV)
		{
			System.out.println(NNV.getMessage());
			ct++;
		}
		}while(ct>0);
		System.out.println(unEtudiant);
	}

}
