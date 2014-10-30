import java.util.Scanner;

/**
* P��metodi, miss� kutsutaan "alku" nimist� metodia
*/

public class ekavalikko {

	public static void main(String[] args) {

		alku();
	}

	/**
	* P��valikko eri reseptikirjastoihin.
	* @param luku K�ytt�j�n sy�tt�m� luku, mit� reseptej� h�n haluaa katsoa. 
	*/
	public static void alku() {

		int luku = 0;

		Scanner lukija = new Scanner(System.in);

		System.out.println("** RESEPTIKIRJANPITO ** \n");
		System.out.println("* " + "1 - Lihareseptit");
		System.out.println("* " + "2 - Kalareseptit");
		System.out.println("* " + "3 - Kasvisreseptit");
		System.out.println("* " + "4 - Hae resepti�");

		System.out.println("\nMit� resepteja haluat katsoa? ");
		System.out.println("Sy�t� haluamasi luku: ");
		luku = lukija.nextInt();

		if (luku < 1 || luku > 4) {
			System.out.println("V��r� luku!");
			System.out.println("Mit� resepteja haluat katsoa? ");
			System.out.println("Sy�t� haluamasi luku: ");
			luku = lukija.nextInt();
		}

		else {
			switch (luku) {
		case 1:
			liha.lihaReseptit();
			break;
		case 2:
			kala.kalaReseptit();
			break;
		case 3:
			kasvis.kasvisReseptit();
			break;
		case 4:
			haku.hakuValikko();
			break;
		}
		}
	}
}
