package gestionEtudiant;

public class NoteNonValideExeption extends Exception {
	Float note;
    public NoteNonValideExeption(float note){
    	this.note=note;
    	
    }
    public String getMessage(){
    	return "la note "+this.note+" n\'est pas valide:";
    }
}
