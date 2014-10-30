import java.util.Scanner;

/**
* Hakee reseptej� niiden nimill�.
* @param etsi Hakusana, jolla etsit��n reseptej�.
* @param karjalanpaisti Karjalanpaisti-resepti
* @param kinkkupasta Kinkkupastan resepti
* @param savuporokiusaus Savuporokiusauksen resepti
* @param pestolohi Pestolohen resepti
* @param katkarapurisotto Katkarapurisoton resepti
* @param lohipasta Lohipastan resepti
* @param avokadopasta Avokadopastan resepti
* @param parsakeitto Parsakeiton resepti
* @param punajuurilaatikko Punajuurilaatikon resepti
*/
public class haku {
	public static void hakuValikko() {
		
		String karjalanpaisti =
			"\nKARJALANPAISTI\n"+
			"1 rs (800 g)	Pirkka karjalanpaistilihoja \n"+
			"2 (250 g)	sipulia \n"+
			"2-3 (250 g)	porkkanaa \n"+
			"1 tl	suolaa\n"+
			"10	Pirkka kokonaista maustepippuria\n"+
			"vett� \n"+
			"Vaihe 1 \n"+
			"Kuori ja lohko sipulit. Kuori ja paloittele porkkanat reiluiksi paloiksi. \n"+
			"Vaihe 2 \n"+
			"Pane voideltuun pataan tai vuokaan kerroksittain lihaa, sipulia ja porkkanoita, suolaa ja pippureita.\n"+
			"Kaada vuokaan vett� sen verran, ett� lihat juuri ja juuri peittyv�t.\n"+
			"Vaihe 3\n"+
			"Kypsenn� 175 asteessa 2-3 tuntia. Lis�� vett� tarvittaessa.\n"+
			"Peit� halutessasi kypsymisen loppuvaiheessa kannella.\n"+ 
			"Tarjoa keitettyjen perunoiden tai perunasoseen kanssa. Lis�ksi maistuvat puolukkahillo ja etikkakurkut.\n";


			String kinkkupasta =
			"\nKINKKUPASTA\n"+
			"150 g	Pirkka t�ysjyv�spagettia \n"+
			"1	Knorr kasvisliemikuutio \n"+
			"Kastike	\n"+
			"200 g	Pirkka ylikyps�� kinkkua \n"+
			"1 (120 g)	sipuli \n"+
			"1 rkl	Flora Culinesse juoksevaa kasvi�ljyvalmistetta \n"+
			"1 rkl	Turun sinappia \n"+
			"1 prk (2 dl)	Cr�me Bonjour maustettua ruokakermaa, pippuri \n"+
			"n. 2 dl	vett� \n"+
			"	ruohosipulia tai persiljaa hienonnettuna \n"+
			"	Pirkka parmesaania \n"+
			"Vaihe 1 \n"+
			"Keit� pasta muuten pakkauksen ohjeen mukaan, mutta korvaa suola liemikuutiolla. \n"+
			"Vaihe 2 \n"+
			"Leikkaa kinkku pieniksi kuutioiksi. Kuori ja hienonna sipuli. \n"+
			"Vaihe 3 \n"+
			"Kuullota sipuli rasvassa. Lis�� pannulle sinappi, kinkkukuutiot ja ruokakerma. Kuumenna. Ohenna kastike vedell�. \n"+
			"Vaihe 4 \n"+
			"Annostele valutettu pasta ja kastike lautasille. Koristele yrteill�. Tarjoa lis�ksi parmesaaniraastetta. \n";


			String savuporokiusaus = 
			"\nSAVUPOROKIUSAUS\n"+
			"2 ps (� 500 g)	Pirkka perunasuikaleita (pakaste) \n"+
			"2 (200 g)	sipulia tai \n"+
			"1 ps (200 g)	Pirkka sipulikuutioita (pakaste) \n"+
			"1-2	valkosipulinkyntt� \n"+
			"1 pkt (100 g)	Pirkka poron kylm�savupaistia \n"+
			"1 tl	suolaa \n"+
			"1 tl	timjamia \n"+
			"1/2 tl	mustapippuria \n"+
			"2 tlk (� 2 dl)	Pirkka laktoositonta ruokakermaa (15%) \n"+
			"Vaihe 1\n"+
			"Kaada toinen pussi perunasuikaleita voideltuun laakeaan vuokaan. \n"+
			"Hienonna kuoritut sipulit ja valkosipulit ja levit� ne perunoiden p��lle. \n"+
			"(Voit k�ytt�� my�s pakastesipulikuutioita.) Mausta suolalla (1/2 tl), timjamilla ja mustapippurilla.\n"+
			"Vaihe 2 \n"+
			"Leikkaa savuporo pieniksi kuutioiksi. Levit� savuporokuutiot ja toinen perunasuikalepussi vuokaan. \n"+
			"Ripottele pinnalle loput suolat ja kaada joukkoon ruokakerma. \n"+
			"Vaihe 3 \n"+
			"Kypsenn� kiusausta uunin alatasolla 225 asteessa 30 minuuttia.\n"+
			"Laske l�mp� 200 asteeseen ja kypsenn� viel� 30-40 minuuttia. Tarjoa savuporokiusaus etikkapunajuurien ja raikkaan salaatin kanssa. \n";

			String pestolohi =
				"GRILLATTU PESTOLOHI\n"+
				"1 (625 g)	Pirkka kirjolohifilee (sis. 1 % suolaa) \n"+
				"voita paistamiseen \n"+
				"Korianteripesto  \n"+
				"1-2 ruukkua (n. 35 g)	tuoretta korianteria \n"+
				"1/2 dl (35 g)	Pirkka pinjansiemeni� \n"+
				"1	valkosipulinkynsi \n"+
				"1 dl (n. 50 g)	parmesaanijuustoa raastettuna \n"+
				"n. 1/2 dl	Pirkka ekstra neitsytoliivi�ljy� \n"+
				"	suolaa \n"+
				"	mustapippuria \n"+
				"Vaihe 1 \n"+
				"Hienonna sauvasekoittimella korianteri varsineen, pinjansiemenet, kuorittu valkosipulinkynsi ja parmesaaniraaste. \n"+
				"Ohenna tarvittaessa �ljyll�. Mausta pesto suolalla ja mustapippurilla. \n"+
				"Vaihe 2 \n"+
				"Leikkaa kirjolohi nelj��n annospalaan. Paista rasvassa parilalla joko grilliss� tai liedell�.  \n"+
				"Paista ensin nahkapuoli (4-5 minuuttia), k��nn� ja kypsenn� kunnes kala on l�pikuultamatonta.  \n"+
				"Tarjoa kala korianteripeston, perunoiden ja salaatin kanssa. \n";

				String katkarapurisotto =
				"KATKARAPURISOTTO\n"+
				"1 (200 g)	fenkoli \n"+
				"1 (120 g)	sipuli \n"+
				"1	valkosipulinkynsi \n"+
				"1-2 (100 g)	porkkanaa \n"+
				"2 rkl	ekstra neitsytoliivi�ljy� \n"+
				"3 dl	Pirkka risottoriisi� \n"+
				"2 dl	valkoviini� (alkoholitonta) \n"+
				"n. 7 dl	vett�  \n"+
				"2 rkl	kasvisfondia \n"+
				"1 ps (180 g)	Pirkka katkarapuja (pakaste) \n"+
				"1 dl	parmesaania raastettuna \n"+
				"1/2 dl	tilli� \n"+
				"	mustapippuria \n"+
				"(ripaus	suolaa) \n"+
				"Vaihe 1 \n"+
				"Halkaise fenkoli ja poista kova kanta. Hienonna fenkoli, sipuli ja valkosipuli. Viipaloi kuoritut porkkanat. \n"+
				"Vaihe 2 \n"+
				"Kuullota sipulia ja valkosipulia rasvassa. Lis�� riisi ja anna riisien kuullottua pari minuuttia. \n"+
				"Kaada valkoviini kattilaan. Sekoittele, kunnes viini on imeytynyt riisiin. Lis�� fenkoli ja porkkanat. \n"+
				"Vaihe 3 \n"+
				"Kiehauta vesi toisessa kattilassa ja lis�� fondi. Lis�� noin 1 dl kiehuvaa kasvislient� kerrallaan risottoon. \n"+
				"Kun neste on imeytynyt, lis�� taas noin 1 dl lient�, jatka, kunnes l�hes kaikki neste on k�ytetty ja riisi on juuri ja juuri kyps��. \n"+
				"Risotto saa j��d� l�ys�ksi. Aikaa kuluu noin 20 minuuttia. \n"+
				"Vaihe 4 \n"+
				"Lis�� sulatetut ja valutetut katkaravut kattilaan. Mausta parmesaanilla, tillill�, ja pippurilla. Tarkista maku. \n";

				String lohipasta =
				"LOHIPASTA\n"+
				"300 g	Pirkka penne t�ysjyv�pastaa \n"+
				"1 (n. 300 g)	kes�kurpitsa \n"+
				"2 (n. 200 g)	sipulia \n"+
				"1	valkosipulinkynsi \n"+
				"2 rkl	�ljy� \n"+
				"1/2 tl	suolaa \n"+
				"	mustapippuria \n"+
				"1 rs (300 g)	Pirkka kirjolohisuikaleita (sis. suolaa 1 %) \n"+
				"1/2 rs (� 250 g)	Pirkka kirsikkatomaatteja \n"+
				"1/2 ruukkua	tuoretta basilikaa \n"+
				"Pinnalle \n"+	
				"1 ps (150 g)	Valio Koskenlaskija murennettua \n"+
				"Vaihe 1 \n"+
				"Keit� pasta suolalla maustetussa vedess� pakkauksen ohjeen mukaan. Sekoita kyps�n, valutetun pastan joukkoon 1 rkl �ljy�. \n"+
				"Vaihe 2 \n"+
				"Suikaloi kes�kurpitsa. Kuori ja hienonna sipulit ja valkosipuli. \n"+
				"Vaihe 3 \n"+
				"Kuullota sipulit rasvassa paistokasarissa. Lis�� kes�kurpitsasuikaleet ja ruskista niit� hieman.  \n"+
				"Mausta suolalla ja pippurilla. \n"+
				"Vaihe 4 \n"+
				"Siirr� kasvisseos paistokasarin toiseen reunaan. Kumoa kasariin lohisuikaleet ja kypsenn�. \n"+
				"Halkaise kirsikkatomaatit ja hienonna basilika. Sekoita tomaatit ja basilika varovasti kasviksien sek� lohen joukkoon. \n"+
				"Vaihe 5 \n"+
				"Kuumenna tarjoilukulho. Kaada siihen kuuma pasta ja kirjolohi-kasvisseos. Tarjoa lis�ksi juustomurua. \n";

				
				String avokadopasta = "AVOKADOPASTA\n"+
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
		
		System.out.print("Mit� haluat etsi�? ");
		String etsi = lukija.nextLine();

		if (etsi.indexOf("karjalanpaisti") != -1) {
		System.out.println(karjalanpaisti);
		}
		else if (etsi.indexOf("kinkkupasta") != -1) {
			System.out.println(kinkkupasta);
			}
		else if (etsi.indexOf("savuporokiusaus") != -1) {
			System.out.println(savuporokiusaus);
			}
		else if (etsi.indexOf("avokadopasta") != -1) {
			System.out.println(avokadopasta);
			}
		else if (etsi.indexOf("parsakeitto") != -1) {
			System.out.println(parsakeitto);
			}
		else if (etsi.indexOf("punajuurilaatikko") != -1) {
			System.out.println(punajuurilaatikko);
			}
		else if (etsi.indexOf("pestolohi") != -1) {
			System.out.println(pestolohi);
			}
		else if (etsi.indexOf("katkarapurisotto") != -1) {
			System.out.println(katkarapurisotto);
			}
		else if (etsi.indexOf("lohipasta") != -1) {
			System.out.println(lohipasta);
			}
		else {
			System.out.println("Haulla ei l�ydy resepti�.");
		}
	}

}
