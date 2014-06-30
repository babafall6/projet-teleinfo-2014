package gestionEtudiant.test;

import gestionEtudiants.Etudiant;
import gestionEtudiants.MyExceptin;

public class TesteEtudiant {

	
	public static void main(String[] args) throws MyExceptin {
		
		Etudiant unEtudiant=new Etudiant("Mimi");	
		
		Etudiant etudiant1=new Etudiant("Sané");
		Etudiant etudiant=new Etudiant("Fatoumata");
	
			unEtudiant.ajouterNote(12);
			unEtudiant.ajouterNote(15);
			etudiant.ajouterNote(14);
			etudiant.ajouterNote(4);
			etudiant.ajouterNote(14);
			
		
		System.out.println("************* moyenne de "+etudiant1.toString()+" : "+etudiant1.moyenne());
		System.out.println("************* moyenne de "+unEtudiant.toString()+" : "+unEtudiant.moyenne());
		System.out.println("************* moyenne de "+etudiant.toString()+" : "+etudiant.moyenne());
		
		
	}

}
