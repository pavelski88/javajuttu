
import java.util.Scanner;

/**
* Kasvisreseptit.
* @param luku Käyttäjän syöttämä luku, mitä reseptejä hän haluaa katsoa.
* @param avokadopasta Avokadopastan resepti
* @param parsakeitto Parsakeiton resepti
* @param punajuurilaatikko Punajuurilaatikon resepti
*/

public class kasvis {
	public static void kasvisReseptit() {
		
			int luku = 0;
			String avokadopasta = 
				"AVOKADOPASTA\n"+
				"1 ps (250 g)	Pirkka fettuccine tuorepastaa \n"+
				"1 iso (350 g)	Pirkka syöntikypsä avokado\n"+
				"1-2	valkosipulinkynttä\n"+
				"1 dl	Pirkka pinjansiemeniä\n"+
				"1 1/2 dl	Pirkka parmesaania raastettuna\n"+
				"1/2 dl	basilikaa hienonnettuna\n"+
				"2-3 rkl	Pirkka ekstra neitsytoliiviöljyä\n"+
				"1/2-1 rkl	sitruunanmehua\n"+
				"n. 1/2 tl	suolaa\n"+
					"mustapippuria\n"+
				"n. 1/2 dl	pastan keitinlientä\n"+
				"Vaihe 1\n"+
				"Keitä pasta pakkauksen ohjeen mukaan.\n"+
				"Vaihe 2\n"+
				"Halkaise, poista siemen ja koverra avokadon hedelmäliha kuorestaan.\n"+
				"Soseuta avokado karkeasti haarukalla. Hienonna valkosipulinkynsi veitsellä. Paahda pinjansiemenet.\n"+
				"Vaihe 3\n"+
				"Sekoita avokado, valkosipuli, pinjansiemenet, parmesaani, basilika, öljy, sitruunanmehu ja mausteet keskenään. \n"+
				"Seokseen saa jäädä sattumia.\n"+
				"Vaihe 4\n"+
				"Valuta pasta, mutta ota talteen hieman keitinlientä. Sekoita keitinliemi avokadoseoksen joukkoon ja yhdistä seos pastaan.\n"+
				"Tarkista maku. Lisää suolaa ja pippuria tarvittaessa. Tarjoa lisäksi parmesaania.\n";

				String parsakeitto =
				"PARSAKEITTO \n"+
				"1 nippu (500 g)	tuoretta valkoista parsaa \n"+
				"3 dl	vettä \n"+
				"3/4 tl	suolaa \n"+
				"1 1/2 tl	sokeria \n"+
				"1	salottisipuli \n"+
				"1	valkosipulinkynsi \n"+
				"1 rkl	voita \n"+
				"1 dl	Pirkka kuohukermaa \n"+
				"1/2 rkl	sitruunanmehua \n"+
				"	suolaa ja pippuria \n"+
				"	koristeeksi tuoreita yrttejä \n"+
				"Vaihe 1 \n"+
				"Huuhtele parsat ja kuori ne ohuelti kuorimaveitsellä. Säästä kuoret. \n"+
				"Leikkaa tai napsauta parsojen puumainen kantaosa pois (noin 2 cm). \n"+
				"Vaihe 2 \n"+
				"Mittaa kattilaan vesi, suola ja sokeri. Keitä kuoria noin 10 minuuttia. Siivilöi liemi talteen ja heitä kuoret pois. \n"+
				"Vaihe 3 \n"+
				"Kuori ja hienonna sipulit. Paloittele parsan varret pienemmiksi paloiksi, säästä nuput kokonaisina. \n"+
				"Kuullota sipuleita voissa kattilassa. Lisää parsat ja kuorien keitinliemi. Keitä noin 10 minuuttia. \n"+
				"Vaihe 4 \n"+
				"Kaada osa nesteestä erilliseen kulhoon myöhempää käyttöä varten. \n"+
				"Voit tässä vaiheessa nostella parsan nuput pois, mikäli haluat säästää ne kokonaisina keiton koristeeksi. \n"+
				"Vaihe 5 \n"+
				"Soseuta keitto sauvasekoittimella. Sekoita joukkoon kerma ja sitruunanmehu.  \n"+
				"Lisää keitinlientä niin paljon, että keitto on sopivan sakeaa. Kuumenna keitto uudelleen. \n"+
				"Mausta tarvittaessa suolalla ja pippurilla. Annostele keitto kulhoihin ja koristele annokset parsan nupuilla sekä tuoreilla yrteillä.  \n"+
				"Tarjoa pehmeä parsakeitto vaalean leivän kanssa. \n";

				String punajuurilaatikko =
				"PUNAJUURILAATIKKO \n"+
				"1 kg	Pirkka punajuuria \n"+
				"1 tlk	Pirkka crème fraîchea (ranskankerma) \n"+
				"1 ps (150 g)	Valio Aura sinihomejuustomurua \n"+
				"	(ripaus suolaa) \n"+
				"Pinnalle	 \n"+
				"	korppujauhoja \n"+
				"Vaihe 1 \n"+
				"Keitä punajuuret kuorineen kypsäksi. Keittoaika riippuu punajuurten koosta. Jäähdytä punajuuret kylmässä vedessä. \n"+
				"Vaihe 2 \n"+
				"Kuori punajuuret ja raasta ne karkeaksi raasteeksi. Sekoita joukkoon ranskankerma, sinihomejuusto ja tarvittaessa ripaus suolaa.  \n"+
				"Levitä seos laakeaan uunivuokaan ja ripottele pinnalle korppujauhoja.  \n"+
				"Paista punajuurivuokaa 175 asteessa noin 30 minuuttia. Tarjoa Pirkka savustetun kalkkunan tai joulukinkun lisäkkeenä. \n";


			Scanner lukija = new Scanner(System.in);
			
			System.out.println("\n KASVISRESEPTIT \n");
			System.out.println("* " + "1 - Avokadopasta");
			System.out.println("* " + "2 - Parsakeitto");
			System.out.println("* " + "3 - Punajuurilaatikko");
			System.out.println("* " + "4 - Palaa edelliseen valikkoon");
			
			
			System.out.println("Mitä resepteja haluat katsoa? ");
			System.out.println("Syötä haluamasi luku: ");
			luku = lukija.nextInt();
			
			if (luku < 1 || luku > 4) {
				System.out.println("Väärä luku"); 
				System.out.println("Mitä resepteja haluat katsoa? ");
				System.out.println("Syötä haluamasi luku: ");
				luku = lukija.nextInt();
			}	
			
			
			switch (luku) {
			case 1:
				System.out.println(avokadopasta); 
				System.out.println("*** Palataan takaisin valikkoon ***"); 
				kasvis.kasvisReseptit();
				break;
			case 2:
				System.out.println(parsakeitto);
				System.out.println("*** Palataan takaisin valikkoon ***"); 
				kasvis.kasvisReseptit();
				break;
			case 3:
				System.out.println(punajuurilaatikko); 
				System.out.println("*** Palataan takaisin valikkoon ***"); 
				kasvis.kasvisReseptit();
				break;
			case 4:
				ekavalikko.alku();
				break;
				}
			 
			}
		}