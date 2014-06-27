package Exercice5;
import java.util.Scanner;
import java.io.*;

 	
public class NombreAleatoire {
	
	public NombreAleatoire(){
		
	}
	
    public void saisiChiffre() throws NumberFormatException{
    	double nombr;
		int val;
		int index;
		char reponse = 'O';
		do{
			
	    	System.out.println(" DONNER UN NOMBRE COMPRIS ENTRE 1 ET 10"  );
	    	Scanner sc = new Scanner(System.in);
			val = sc.nextInt();
			sc.nextLine();
			
            nombr = Math.random()*10; // la methode random genere un nombre entre 0 et 10
            index = (int)nombr;
            if(val < 0 || val >10)
            {
            	 throw new NumberFormatException();
            }
            else 
            	if(val != index){
         	   System.out.println(" ENCORE UN PEU" );
         	  
          
            }
         	   else
         		   if(val== index)
         		   System.out.println("EXCELLENT VOUS AVEZ ETE REMARQUABLE ");
			}while(val !=  index );
			System.out.println(" Bravo !");
 	  }
    
    
    
	
	public static void main(String[] args) {
		char reponse;
		Scanner sc = new Scanner(System.in);
		System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
		System.out.println(" BIENVENU DANS L\'UNIVER DE JEUX \n"  );
		System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
		do{ 
			NombreAleatoire n = new NombreAleatoire();
			try {
				n.saisiChiffre();
			} catch (NumberFormatException e) {
				
				System.out.println(e.getMessage());
			}
		
			
			do{
				System.out.println(" Voulez vous continuer ?(O/N)");
				reponse = sc.nextLine().charAt(0);
			  }while(reponse != 'N' && reponse != 'O');
		
			
		}while(reponse == 'O');
	
		System.out.println("Au Revoir...");
	}

}