
public class mainRandomnumber {
	public static void main(String[] args) {
		RandomNumber number = new RandomNumber();
		try{
		number.saisirNombrealea();
		}	
catch(NumberFormatException e)
    {
	  System.out.println("invalide");
    }
	}

}
