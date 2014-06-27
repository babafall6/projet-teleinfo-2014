import gestionEtudiants.Etudiant;


public class NumberFormatException extends Exception {
int nombre;
	public NumberFormatException(int nombre){
  this.nombre = nombre;
	}
public String getMessage(){
	String msg= "";
	try{
		msg="nombre " +this.nombre+ " est incorrecte ";
		System.out.println(msg);
		RandomNumber rn = new RandomNumber();
		rn.saisirNombrealea();
	}
	catch (Exception e){
		e.getMessage();
	}
	return msg;
}
}