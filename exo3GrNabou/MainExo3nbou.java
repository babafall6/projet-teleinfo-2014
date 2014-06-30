package exo3Nabou;

public class MainExo3nbou {

	
	public static void main(String[] args) {
		
		    Pigeon l = new Pigeon();
		   l.crier();
		    l.manger();
		   l.reproduire();
		    System.out.println(l.toString());
	
	        {
		    Chien c1 = new Chien();
		    c1.crier();
		    c1.manger();
		    c1.reproduire();
			   
			    System.out.println(c1.toString());
	}
	{
			    Poisson p1 = new Poisson();
			    p1.crier();
				   p1.manger();
				    p1.reproduire();
				   p1.crier();
				    System.out.println(p1.toString());
	}
	{    
				    Serpent s1 = new Serpent();
				    s1.crier();
				    s1.manger();
				    s1.reproduire();
				    s1.crier();
					    System.out.println(s1.toString());
	}
	}
}


