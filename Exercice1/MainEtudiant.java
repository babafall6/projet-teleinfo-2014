package Exercice1;

import java.util.Scanner;

public class MainEtudiant {
	
	public static void main(String[] args) {
		
		Etudiant etu = new Etudiant("niang");
		try{
			etu.saisiNotes();
			
		}catch(NoteNonValideException e){
			System.out.println(e.getMessage());
		}
		
		etu.calcMoyenne();
		System.out.println(etu.getListeNote());	
		System.out.println("Le nombre de note est "+etu.nbreNote());
		System.out.println(etu.toString());
		
		

	}

}
