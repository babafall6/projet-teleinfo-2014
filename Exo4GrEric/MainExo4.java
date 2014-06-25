import lesInterface.Pigeon;
import lesInterface.Poisson;
import lesInterface.Serpent;




public class MainExo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pigeon pigeon1=new Pigeon();
		Poisson poisson1=new Poisson();
		Serpent serpent1=new Serpent();
		System.out.println("======le pigeon===");
		System.out.println("utilite du pigeon est :"+pigeon1.utilite());
		System.out.println("======le poisson===");
		System.out.println("le poisson est "+poisson1.chasse()+" � la "+poisson1.abri());
		System.out.println("======le serpent===");
		System.out.println("le serpent est "+serpent1.chasse()+" dans la "+serpent1.abri());

	}

}
