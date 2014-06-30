package exo4;
public class mainExo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pigeon Pi = new Pigeon("compagnie","maison") ;
		Serpent S = new Serpent("souri");
		Poisson Po= new Poisson("manger","aquarium");
		Pi.afficher();
		S.afficher();
		Po.afficher();
		}

}
