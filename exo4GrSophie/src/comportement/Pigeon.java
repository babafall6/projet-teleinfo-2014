import java.util.Scanner;
public class Saisie{
   float tableauNote[];
	//
   public saisie(){
     tableauNote = new float[5];
   }
//methode saisi des notes
   public void SaisieDesNotes() throws NoteNonValideExeption{
     Scanner sc = new Sacnner(System.in);
	for (int i = 0; i<5; i++){
System.out.println("saisi la note"+(i+1) + " : "));

float f = sc.nexFloat();
if( f<0 || f> 20)
throw new NoteNonValideException();
else{
this.tableauNote[]
}
}}
   public static void main (String[] arg){
Saisi s= new Saisie ();
try{
s.saisieDesNotes();
}
catch(Exception)
   }
}import java.util.Scanner;
public class Saisie{
   float tableauNote[];
	//
   public saisie(){
     tableauNote = new float[5];
   }
//methode saisi des notes
   public void SaisieDesNotes() throws NoteNonValideExeption{
     Scanner sc = new Sacnner(System.in);
	for (int i = 0; i<5; i++){
System.out.println("saisi la note"+(i+1) + " : "));

float f = sc.nexFloat();
if( f<0 || f> 20)
throw new NoteNonValideException();
else{
this.tableauNote[]
}
}}
   public static void main (String[] arg){
Saisi s= new Saisie ();
try{
s.saisieDesNotes();
}
catch(Exception)
   }
}package comportement;

import comportement.inter.Domestique;
import comportement.inter.Sauvage;

public class Pigeon implements Domestique,Sauvage{

	public void abri() {
		System.out.println("cage");
	}

	public void chasse() {
		System.out.println("Chasser : non");
		
	}

}
