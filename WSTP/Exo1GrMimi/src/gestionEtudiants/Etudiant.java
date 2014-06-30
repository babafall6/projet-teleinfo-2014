package gestionEtudiants;



import java.util.ArrayList;

public class Etudiant {
	
	
	private String nom;
	
	private float moyenne=0;

	private ArrayList<Float> listeNotes;
	
	public Etudiant(String nom){
		this.nom=nom;
		listeNotes=new ArrayList<Float>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Float> getListeNotes() {
		return listeNotes;
	}

	public void setListeNotes(ArrayList<Float> listeNotes) {
		this.listeNotes = listeNotes;
	}

	public float getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
	public double moyenne(){
		
		double laMoyenne = 0.0;
		
		for (int i = 0; i < listeNotes.size(); i++) {
			laMoyenne+=listeNotes.get(i);
		}
		laMoyenne=laMoyenne/listeNotes.size();

		return laMoyenne;
	}
	
	public void ajouterNote(int note) throws MyExceptin{
			
			if( (note<0) || (note>20)) throw new MyExceptin("NoteNonValideExeption");
				
			else{
			
				listeNotes.add((float)note);
			}		
	}
	
	public String toString(){
		return getNom();
		
	}
	
	

}
