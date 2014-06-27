package gestionEtudiants;
import java.util.*;
import java.lang.*;
	
public class Etudiant  {
     
	 private String nom;
     private List <Float> listNotes;
     private Float moyenne;
	 
      
	public Etudiant(){listNotes=new ArrayList<Float>();}
       public Etudiant (String nom)
          {
    	   	this.nom = nom;
    	   	listNotes=new ArrayList<Float>();
          }
       public double getMoyenne()
          {
    	    return moyenne;
          }
       public String getNom()
          {
    	    return nom;
          }
       public List<Float> getListNotes()
       	  {
    	    return listNotes;
          }
    public void ajouterNotes() throws NoteNonValideException 
           {
    	char rep;
           
    	    do{
    	    	
    	System.out.println("Veuillez saisir une note :");
    	Scanner x = new Scanner(System.in);
       	Float note = x.nextFloat();
       	System.out.print("voulez vous entrer une nouvelle note o/n ");
     	Scanner sc = new Scanner(System.in);
     	 rep= sc.nextLine().charAt(0);
    		 if(rep!='o' || rep!='O')
    	
    		if(note<0.0 || note>20.0){
    			 throw new NoteNonValideException(note);
    		 }
    		 else {
     			 listNotes.add(note);
     					float Somme = 0;
     			 		
     			          for(int j=0; j<listNotes.size(); j++){
     			     	    Float i = listNotes.get(j);
     			              Somme = Somme + i;
     			          }
     			              moyenne = Somme/listNotes.size();
     		 }
    	    }
    	    while(rep=='o' || rep=='O');
           }
    public String toString() {
    	return "l'Etudiant " +nom+ " a pour moyenne = " +moyenne;
    }
    public void afficher() {
    	System.out.println("l'Etudiant " +nom+ " a pour moyenne = " +moyenne);
    }
}
       

