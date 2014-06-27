package gestionEtudiants;

public class NoteNonValideException extends Exception {
float note;
	public NoteNonValideException(float note){
  this.note = note;
	}
public String getMessage(){
	String msg= "";
	try{
		msg="la note " +this.note+ " est invalide ";
		System.out.println(msg);
		Etudiant et = new Etudiant();
		et.ajouterNotes();
	}
	catch (Exception e){
		e.getMessage();
	}
	return msg;
}
}