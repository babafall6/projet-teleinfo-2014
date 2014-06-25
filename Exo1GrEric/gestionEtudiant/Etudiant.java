package gestionEtudiant;

import java.util.ArrayList;
import java.util.Scanner;

public class Etudiant {
	private String nom;
	private ArrayList<Float> listNotes;
	private Float moyenne;
	
	public Etudiant(String nom){
		this.nom=nom;	
		listNotes=new ArrayList<Float>();
		moyenne=new Float(0);
	}
	public double getMoyenne()
	{
		return 	this.moyenne;
	}
	public String getNom()
	{
		return 	this.nom;
	}
	public ArrayList<Float> getListNotes()
	{
		return 	this.listNotes;
	}
	public void ajouterNote()throws NoteNonValideExeption{
		Scanner sc=new Scanner(System.in);
		float note;
		this.moyenne=(float)0;
		System.out.println("ajoutez une note!");
		note=sc.nextFloat();
		if(note<0||note>20)
			throw new NoteNonValideExeption(note);
		else
		{
			listNotes.add(note);
			for(int indiceTab=0;indiceTab<listNotes.size();indiceTab++)
			{
				this.moyenne=this.moyenne+listNotes.get(indiceTab);
			}
			this.moyenne=this.moyenne/listNotes.size();
		}
	}
	public String toString()
	{
		return "Moyenne de "+this.nom+" :"+this.moyenne;
	}
	

}
