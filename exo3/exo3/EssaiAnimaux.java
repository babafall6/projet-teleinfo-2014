public class EssaiAnimaux {
	

	
	
	public static void main(String args[])
	{
		Pigeon peroquet = new Pigeon();
		System.out.println(" Oups le crie du pigeon est :" +peroquet.getCrier());
		System.out.println(" Oups le pigeon est :" +peroquet.getManger());
		System.out.println(" oups pigeon se reproduit par  :" +peroquet.getSeReproduire());
		
			Poisson baleine = new Poisson();
			System.out.println(" le crie du poisson est :" +baleine.getCrier());
			System.out.println("  le poisson est :" +baleine.getManger());
			System.out.println(" Le poisson se reproduit par  :" +baleine.getSeReproduire());
			
			Serpent anaconda = new Serpent();
	   System.out.println(" waou le crie du serpent est :" +anaconda.getCrier());
	   System.out.println(" waou le serpent est :" +anaconda.getManger());
		System.out.println(" waou Le serpent se reproduit par  :" +anaconda.getSeReproduire());

}
}