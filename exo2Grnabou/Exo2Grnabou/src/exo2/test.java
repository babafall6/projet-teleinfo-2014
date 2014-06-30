package exo2;

public class test {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Etudiant  etu = new Etudiant (1);
		EtudiantBoursier etub = new EtudiantBoursier(2,5000.0);
		
		etu.faireCOURS("java");
		etu.subirEaluation("MATH");
		etub.faireCOURS("php");
		etub.subirEaluation("php");
		
		

	}

}
