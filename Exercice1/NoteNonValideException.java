package Exercice1;

public class NoteNonValideException extends Exception{
	float fl;

	public NoteNonValideException(float fl) {
		this.fl = fl;
	}

	public String getMessage(){
		String msg = "";
		
		Etudiant et = new Etudiant("Hanne");
		try {
			msg = "La note "+ this.fl +" n'est pas prise en compte !!!\n Entrez une note comprise entre 0 et 20";
			System.out.println(msg);
			System.out.println("Re saisir une note");
			et.saisiNotes();
		} catch (NoteNonValideException e) {
			e.printStackTrace();
		}
		return msg;
	}
	
}
