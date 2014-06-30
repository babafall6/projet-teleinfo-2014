package Exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Etudiant {
	private String nom;
	private ArrayList<Float> listeNotes = new ArrayList<Float>();
	private float moyenne;
	
	public Etudiant(String nm){
		nom = nm;
	}
	
	public String getNom(){
		return nom;
	}
	public ArrayList<Float> getListeNote(){
		return listeNotes;
	}
	public float getMoyenne(){
		return moyenne;
	}
	
	public void ajouterNote(float note){
		listeNotes.add(note);
	}
	public void setMoyenne(float moy){
		moyenne = moy;
	}
	
	public int nbreNote(){
		int n = listeNotes.size();
		return n;
	}
	
	public float calcMoyenne(){
		float somme = 0;
		for(int i = 0; i < listeNotes.size(); i++){
			somme += listeNotes.get(i);
		}
		moyenne = somme / listeNotes.size();
		
		return moyenne; 
	}
	
	public String toString(){
		return "Moyenne de "+ this.nom + " : " + this.moyenne;
	}
	public void saisiNotes() throws NoteNonValideException{
		char reponse ='o' ;
		Scanner sc = new Scanner(System.in);
		float noteSaisi;
		do{
			float fl = 0;
			System.out.println("Entrez une note ? ");
			fl = sc.nextFloat();
			if(fl < 0.0 || fl > 20.0)
				throw new NoteNonValideException(fl);
			else{
				ajouterNote(fl);
				sc.nextLine();
				System.out.println("La note est bien ajoutée...");
			}   
		  do{
			  System.out.println("Voulez vous continuez ? (Choisir 'o' ou 'n')");
			  reponse = sc.nextLine().charAt(0);
			  
		  }while(reponse != 'o' && reponse != 'n');
			
		}while(reponse == 'o');
		
		System.out.println("bye bye !!!");
		
	}
	
	

}
