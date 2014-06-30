package devinette;

import java.util.Scanner;

public class DevinetteRandom {

	public static boolean devinette(int nbr, int nombre) {
		boolean etat = false;
		if (nombre == 10) {
			return true;
		}

		if (nombre == nbr) {
			etat = true;
			System.out.println("Bravo , deviner encore le chiffre choisi");
		}
		return etat;
	}

	public static void verifie(boolean etat) throws NumberFormatException {

		if (etat == false)
			throw new NumberFormatException();
	}

	public static void main(String[] args) {

		int quitte = 10;
		int choix = 0;
		Scanner saisi = new Scanner(System.in);

		while (choix != quitte) {
			int nbr = (int) (Math.random() * 10);
			System.out.println("*** nbr " + nbr);
			System.out.println("******************************************");
			System.out.println("Donner un nombre :");
			System.out.println("10 :Quitter");
			System.out.println("******************************************");

			choix = saisi.nextInt();

			try {
				boolean b = devinette(nbr, choix);
				verifie(b);
			} catch (NumberFormatException e) {

				e.printStackTrace();
			}

		}
		System.out.println(" Merci et A bientot ...");
		System.exit(0);

	}
}
