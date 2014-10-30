
import java.util.Scanner;

/**
* Kalareseptit.
* @param luku Käyttäjän syöttämä luku, mitä reseptejä hän haluaa katsoa.
* @param pestolohi Pestolohen resepti
* @param katkarapurisotto Katkarapurisoton resepti
* @param lohipasta Lohipastan resepti
*/

public class kala {
	public static void kalaReseptit() {
		
			int luku = 0;
			String pestolohi =
				"GRILLATTU PESTOLOHI\n"+
				"1 (625 g)	Pirkka kirjolohifilee (sis. 1 % suolaa) \n"+
				"voita paistamiseen \n"+
				"Korianteripesto  \n"+
				"1-2 ruukkua (n. 35 g)	tuoretta korianteria \n"+
				"1/2 dl (35 g)	Pirkka pinjansiemeniä \n"+
				"1	valkosipulinkynsi \n"+
				"1 dl (n. 50 g)	parmesaanijuustoa raastettuna \n"+
				"n. 1/2 dl	Pirkka ekstra neitsytoliiviöljyä \n"+
				"	suolaa \n"+
				"	mustapippuria \n"+
				"Vaihe 1 \n"+
				"Hienonna sauvasekoittimella korianteri varsineen, pinjansiemenet, kuorittu valkosipulinkynsi ja parmesaaniraaste. \n"+
				"Ohenna tarvittaessa öljyllä. Mausta pesto suolalla ja mustapippurilla. \n"+
				"Vaihe 2 \n"+
				"Leikkaa kirjolohi neljään annospalaan. Paista rasvassa parilalla joko grillissä tai liedellä.  \n"+
				"Paista ensin nahkapuoli (4-5 minuuttia), käännä ja kypsennä kunnes kala on läpikuultamatonta.  \n"+
				"Tarjoa kala korianteripeston, perunoiden ja salaatin kanssa. \n";

				String katkarapurisotto =
				"KATKARAPURISOTTO\n"+
				"1 (200 g)	fenkoli \n"+
				"1 (120 g)	sipuli \n"+
				"1	valkosipulinkynsi \n"+
				"1-2 (100 g)	porkkanaa \n"+
				"2 rkl	ekstra neitsytoliiviöljyä \n"+
				"3 dl	Pirkka risottoriisiä \n"+
				"2 dl	valkoviiniä (alkoholitonta) \n"+
				"n. 7 dl	vettä  \n"+
				"2 rkl	kasvisfondia \n"+
				"1 ps (180 g)	Pirkka katkarapuja (pakaste) \n"+
				"1 dl	parmesaania raastettuna \n"+
				"1/2 dl	tilliä \n"+
				"	mustapippuria \n"+
				"(ripaus	suolaa) \n"+
				"Vaihe 1 \n"+
				"Halkaise fenkoli ja poista kova kanta. Hienonna fenkoli, sipuli ja valkosipuli. Viipaloi kuoritut porkkanat. \n"+
				"Vaihe 2 \n"+
				"Kuullota sipulia ja valkosipulia rasvassa. Lisää riisi ja anna riisien kuullottua pari minuuttia. \n"+
				"Kaada valkoviini kattilaan. Sekoittele, kunnes viini on imeytynyt riisiin. Lisää fenkoli ja porkkanat. \n"+
				"Vaihe 3 \n"+
				"Kiehauta vesi toisessa kattilassa ja lisää fondi. Lisää noin 1 dl kiehuvaa kasvislientä kerrallaan risottoon. \n"+
				"Kun neste on imeytynyt, lisää taas noin 1 dl lientä, jatka, kunnes lähes kaikki neste on käytetty ja riisi on juuri ja juuri kypsää. \n"+
				"Risotto saa jäädä löysäksi. Aikaa kuluu noin 20 minuuttia. \n"+
				"Vaihe 4 \n"+
				"Lisää sulatetut ja valutetut katkaravut kattilaan. Mausta parmesaanilla, tillillä, ja pippurilla. Tarkista maku. \n";

				String lohipasta =
				"LOHIPASTA\n"+
				"300 g	Pirkka penne täysjyväpastaa \n"+
				"1 (n. 300 g)	kesäkurpitsa \n"+
				"2 (n. 200 g)	sipulia \n"+
				"1	valkosipulinkynsi \n"+
				"2 rkl	öljyä \n"+
				"1/2 tl	suolaa \n"+
				"	mustapippuria \n"+
				"1 rs (300 g)	Pirkka kirjolohisuikaleita (sis. suolaa 1 %) \n"+
				"1/2 rs (à 250 g)	Pirkka kirsikkatomaatteja \n"+
				"1/2 ruukkua	tuoretta basilikaa \n"+
				"Pinnalle \n"+	
				"1 ps (150 g)	Valio Koskenlaskija murennettua \n"+
				"Vaihe 1 \n"+
				"Keitä pasta suolalla maustetussa vedessä pakkauksen ohjeen mukaan. Sekoita kypsän, valutetun pastan joukkoon 1 rkl öljyä. \n"+
				"Vaihe 2 \n"+
				"Suikaloi kesäkurpitsa. Kuori ja hienonna sipulit ja valkosipuli. \n"+
				"Vaihe 3 \n"+
				"Kuullota sipulit rasvassa paistokasarissa. Lisää kesäkurpitsasuikaleet ja ruskista niitä hieman.  \n"+
				"Mausta suolalla ja pippurilla. \n"+
				"Vaihe 4 \n"+
				"Siirrä kasvisseos paistokasarin toiseen reunaan. Kumoa kasariin lohisuikaleet ja kypsennä. \n"+
				"Halkaise kirsikkatomaatit ja hienonna basilika. Sekoita tomaatit ja basilika varovasti kasviksien sekä lohen joukkoon. \n"+
				"Vaihe 5 \n"+
				"Kuumenna tarjoilukulho. Kaada siihen kuuma pasta ja kirjolohi-kasvisseos. Tarjoa lisäksi juustomurua. \n";

			
			Scanner lukija = new Scanner(System.in);
			
			System.out.println("\n KALARESEPTIT \n");
			System.out.println("* " + "1 - Grillattu pestolohi");
			System.out.println("* " + "2 - Katkarapurisotto");
			System.out.println("* " + "3 - Lohipasta");
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
				System.out.println(pestolohi); 
				System.out.println("*** Palataan takaisin valikkoon ***"); 
					kala.kalaReseptit();
				break;
			case 2:
				System.out.println(katkarapurisotto);
				System.out.println("*** Palataan takaisin valikkoon ***"); 
				kala.kalaReseptit();
				break;
			case 3:
				System.out.println(lohipasta); 
				System.out.println("*** Palataan takaisin valikkoon ***"); 
				kala.kalaReseptit();
				break;
			case 4:
				ekavalikko.alku();
				break;
				}
			 
			}
		}