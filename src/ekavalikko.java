import java.util.Scanner;

/**
* Päämetodi, missä kutsutaan "alku" nimistä metodia
*/

public class ekavalikko {

	public static void main(String[] args) {

		alku();
	}

	/**
	* Päävalikko eri reseptikirjastoihin.
	* @param luku Käyttäjän syöttämä luku, mitä reseptejä hän haluaa katsoa. 
	*/
	public static void alku() {

		int luku = 0;

		Scanner lukija = new Scanner(System.in);

		System.out.println("** RESEPTIKIRJANPITO ** \n");
		System.out.println("* " + "1 - Lihareseptit");
		System.out.println("* " + "2 - Kalareseptit");
		System.out.println("* " + "3 - Kasvisreseptit");
		System.out.println("* " + "4 - Hae reseptiä");

		System.out.println("\nMitä resepteja haluat katsoa? ");
		System.out.println("Syötä haluamasi luku: ");
		luku = lukija.nextInt();

		if (luku < 1 || luku > 4) {
			System.out.println("Väärä luku!");
			System.out.println("Mitä resepteja haluat katsoa? ");
			System.out.println("Syötä haluamasi luku: ");
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
