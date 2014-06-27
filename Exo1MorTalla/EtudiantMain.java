package gestionEtudiants;
//import java.util.*;

public class EtudiantMain {

	public static void main(String[] args) throws NoteNonValideException {
		
				Etudiant e = new Etudiant("Mamadou");
		        
				try
				{
	                 e.ajouterNotes();
                   }
              catch(NoteNonValideException n)
                   {
                     System.out.println(n.getMessage());
                   }
				e.afficher();
	}
}

	
