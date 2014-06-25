import java.util.Scanner;

import devinerValeurRandom.Deviner;


/*public class MainExo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Deviner nombreDevine;
		String testNombre="";
		char continu;
		int nombre;
		int ct=0;
		do{
			do{
				nombreDevine=new Deviner();
				do{
					try{
						ct=0;
						System.out.println("entrez un nombre ?");
						testNombre=sc.nextLine();
						Integer.parseInt(testNombre);
					}catch(NumberFormatException nfe)
					{
						System.out.println("la valeur "+testNombre+" n\'est pas valide,veuillez entrer un chiffre !");
						ct++;
					}
				}while(ct>0);
				nombre=Integer.parseInt(testNombre);
				if(nombreDevine.devineNombre(nombre))
					System.out.println("Bravo !!!!!!");
			}while(nombreDevine.devineNombre(nombre));
			System.out.println("Desolé vous avez perdu,le nombre à deviner était: "+nombreDevine.getnombreMyster());
			do{
				System.out.println("voulez vous continuer?(o/n) ");
				continu=sc.nextLine().charAt(0);
				if(continu!='o'&&continu!='n')
					System.out.println("paramatre incorrect ");
			}while(continu!='o'&&continu!='n');
		}while(continu=='o');
		System.out.println("fin de la partie!!!!!");
	}

}*/
