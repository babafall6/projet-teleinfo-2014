import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.lang.Exception;
public class RandomNumber {

  private int NombreAlea;
  private int nombre;
    public void saisirNombrealea ()throws NumberFormatException {
    	char reponse=' ';
    	do{
    	    System.out.print("Veuillez saisir un nombre: ");    
            Scanner al = new Scanner(System.in);  
            Random alea = new Random(); 
            	int NombreAlea = alea.nextInt(10);
            	nombre = al.nextInt();
            	
            	if(nombre<0 || nombre>9){
            		throw new NumberFormatException(nombre);
            	}
            		else{
    	        if (nombre == NombreAlea)
                    {
    	              System.out.println("Bravo Vous avez deviné le nombre");
                    }
                 else {
    	               System.out.println("OOPSS !! vous l'avez manqué");
                      }
            		}
             	System.out.println("Voulez vous recommencer O/n ??");
                Scanner rep = new Scanner(System.in);
                reponse = rep.nextLine().charAt(0);
                if(reponse != 'o' || reponse != 'O'){}
                
    	    }
          while(reponse == 'o' || reponse == 'O');
    	
    	}
    public RandomNumber(){}
    public RandomNumber(int nbreAlea)
         {
    	nbreAlea = NombreAlea;
         }
	
    public int getNombreAlea() {
		return NombreAlea;
	 }
	
    public int getNombre() {
		return nombre;
	 }
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public void setNombreAlea(int nombreAlea) {
			NombreAlea = nombreAlea;
	}
    }
