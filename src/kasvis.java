
import java.util.Scanner;

/**
* Kasvisreseptit.
* @param luku K�ytt�j�n sy�tt�m� luku, mit� reseptej� h�n haluaa katsoa.
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
				"1 iso (350 g)	Pirkka sy�ntikyps� avokado\n"+
				"1-2	valkosipulinkyntt�\n"+
				"1 dl	Pirkka pinjansiemeni�\n"+
				"1 1/2 dl	Pirkka parmesaania raastettuna\n"+
				"1/2 dl	basilikaa hienonnettuna\n"+
				"2-3 rkl	Pirkka ekstra neitsytoliivi�ljy�\n"+
				"1/2-1 rkl	sitruunanmehua\n"+
				"n. 1/2 tl	suolaa\n"+
					"mustapippuria\n"+
				"n. 1/2 dl	pastan keitinlient�\n"+
				"Vaihe 1\n"+
				"Keit� pasta pakkauksen ohjeen mukaan.\n"+
				"Vaihe 2\n"+
				"Halkaise, poista siemen ja koverra avokadon hedelm�liha kuorestaan.\n"+
				"Soseuta avokado karkeasti haarukalla. Hienonna valkosipulinkynsi veitsell�. Paahda pinjansiemenet.\n"+
				"Vaihe 3\n"+
				"Sekoita avokado, valkosipuli, pinjansiemenet, parmesaani, basilika, �ljy, sitruunanmehu ja mausteet kesken��n. \n"+
				"Seokseen saa j��d� sattumia.\n"+
				"Vaihe 4\n"+
				"Valuta pasta, mutta ota talteen hieman keitinlient�. Sekoita keitinliemi avokadoseoksen joukkoon ja yhdist� seos pastaan.\n"+
				"Tarkista maku. Lis�� suolaa ja pippuria tarvittaessa. Tarjoa lis�ksi parmesaania.\n";

				String parsakeitto =
				"PARSAKEITTO \n"+
				"1 nippu (500 g)	tuoretta valkoista parsaa \n"+
				"3 dl	vett� \n"+
				"3/4 tl	suolaa \n"+
				"1 1/2 tl	sokeria \n"+
				"1	salottisipuli \n"+
				"1	valkosipulinkynsi \n"+
				"1 rkl	voita \n"+
				"1 dl	Pirkka kuohukermaa \n"+
				"1/2 rkl	sitruunanmehua \n"+
				"	suolaa ja pippuria \n"+
				"	koristeeksi tuoreita yrttej� \n"+
				"Vaihe 1 \n"+
				"Huuhtele parsat ja kuori ne ohuelti kuorimaveitsell�. S��st� kuoret. \n"+
				"Leikkaa tai napsauta parsojen puumainen kantaosa pois (noin 2 cm). \n"+
				"Vaihe 2 \n"+
				"Mittaa kattilaan vesi, suola ja sokeri. Keit� kuoria noin 10 minuuttia. Siivil�i liemi talteen ja heit� kuoret pois. \n"+
				"Vaihe 3 \n"+
				"Kuori ja hienonna sipulit. Paloittele parsan varret pienemmiksi paloiksi, s��st� nuput kokonaisina. \n"+
				"Kuullota sipuleita voissa kattilassa. Lis�� parsat ja kuorien keitinliemi. Keit� noin 10 minuuttia. \n"+
				"Vaihe 4 \n"+
				"Kaada osa nesteest� erilliseen kulhoon my�hemp�� k�ytt�� varten. \n"+
				"Voit t�ss� vaiheessa nostella parsan nuput pois, mik�li haluat s��st�� ne kokonaisina keiton koristeeksi. \n"+
				"Vaihe 5 \n"+
				"Soseuta keitto sauvasekoittimella. Sekoita joukkoon kerma ja sitruunanmehu.  \n"+
				"Lis�� keitinlient� niin paljon, ett� keitto on sopivan sakeaa. Kuumenna keitto uudelleen. \n"+
				"Mausta tarvittaessa suolalla ja pippurilla. Annostele keitto kulhoihin ja koristele annokset parsan nupuilla sek� tuoreilla yrteill�.  \n"+
				"Tarjoa pehme� parsakeitto vaalean leiv�n kanssa. \n";

				String punajuurilaatikko =
				"PUNAJUURILAATIKKO \n"+
				"1 kg	Pirkka punajuuria \n"+
				"1 tlk	Pirkka cr�me fra�chea (ranskankerma) \n"+
				"1 ps (150 g)	Valio Aura sinihomejuustomurua \n"+
				"	(ripaus suolaa) \n"+
				"Pinnalle	 \n"+
				"	korppujauhoja \n"+
				"Vaihe 1 \n"+
				"Keit� punajuuret kuorineen kyps�ksi. Keittoaika riippuu punajuurten koosta. J��hdyt� punajuuret kylm�ss� vedess�. \n"+
				"Vaihe 2 \n"+
				"Kuori punajuuret ja raasta ne karkeaksi raasteeksi. Sekoita joukkoon ranskankerma, sinihomejuusto ja tarvittaessa ripaus suolaa.  \n"+
				"Levit� seos laakeaan uunivuokaan ja ripottele pinnalle korppujauhoja.  \n"+
				"Paista punajuurivuokaa 175 asteessa noin 30 minuuttia. Tarjoa Pirkka savustetun kalkkunan tai joulukinkun lis�kkeen�. \n";


			Scanner lukija = new Scanner(System.in);
			
			System.out.println("\n KASVISRESEPTIT \n");
			System.out.println("* " + "1 - Avokadopasta");
			System.out.println("* " + "2 - Parsakeitto");
			System.out.println("* " + "3 - Punajuurilaatikko");
			System.out.println("* " + "4 - Palaa edelliseen valikkoon");
			
			
			System.out.println("Mit� resepteja haluat katsoa? ");
			System.out.println("Sy�t� haluamasi luku: ");
			luku = lukija.nextInt();
			
			if (luku < 1 || luku > 4) {
				System.out.println("V��r� luku"); 
				System.out.println("Mit� resepteja haluat katsoa? ");
				System.out.println("Sy�t� haluamasi luku: ");
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