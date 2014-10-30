import java.util.Scanner;

/**
* Hakee reseptejä niiden nimillä.
* @param etsi Hakusana, jolla etsitään reseptejä.
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
			"vettä \n"+
			"Vaihe 1 \n"+
			"Kuori ja lohko sipulit. Kuori ja paloittele porkkanat reiluiksi paloiksi. \n"+
			"Vaihe 2 \n"+
			"Pane voideltuun pataan tai vuokaan kerroksittain lihaa, sipulia ja porkkanoita, suolaa ja pippureita.\n"+
			"Kaada vuokaan vettä sen verran, että lihat juuri ja juuri peittyvät.\n"+
			"Vaihe 3\n"+
			"Kypsennä 175 asteessa 2-3 tuntia. Lisää vettä tarvittaessa.\n"+
			"Peitä halutessasi kypsymisen loppuvaiheessa kannella.\n"+ 
			"Tarjoa keitettyjen perunoiden tai perunasoseen kanssa. Lisäksi maistuvat puolukkahillo ja etikkakurkut.\n";


			String kinkkupasta =
			"\nKINKKUPASTA\n"+
			"150 g	Pirkka täysjyväspagettia \n"+
			"1	Knorr kasvisliemikuutio \n"+
			"Kastike	\n"+
			"200 g	Pirkka ylikypsää kinkkua \n"+
			"1 (120 g)	sipuli \n"+
			"1 rkl	Flora Culinesse juoksevaa kasviöljyvalmistetta \n"+
			"1 rkl	Turun sinappia \n"+
			"1 prk (2 dl)	Crème Bonjour maustettua ruokakermaa, pippuri \n"+
			"n. 2 dl	vettä \n"+
			"	ruohosipulia tai persiljaa hienonnettuna \n"+
			"	Pirkka parmesaania \n"+
			"Vaihe 1 \n"+
			"Keitä pasta muuten pakkauksen ohjeen mukaan, mutta korvaa suola liemikuutiolla. \n"+
			"Vaihe 2 \n"+
			"Leikkaa kinkku pieniksi kuutioiksi. Kuori ja hienonna sipuli. \n"+
			"Vaihe 3 \n"+
			"Kuullota sipuli rasvassa. Lisää pannulle sinappi, kinkkukuutiot ja ruokakerma. Kuumenna. Ohenna kastike vedellä. \n"+
			"Vaihe 4 \n"+
			"Annostele valutettu pasta ja kastike lautasille. Koristele yrteillä. Tarjoa lisäksi parmesaaniraastetta. \n";


			String savuporokiusaus = 
			"\nSAVUPOROKIUSAUS\n"+
			"2 ps (à 500 g)	Pirkka perunasuikaleita (pakaste) \n"+
			"2 (200 g)	sipulia tai \n"+
			"1 ps (200 g)	Pirkka sipulikuutioita (pakaste) \n"+
			"1-2	valkosipulinkynttä \n"+
			"1 pkt (100 g)	Pirkka poron kylmäsavupaistia \n"+
			"1 tl	suolaa \n"+
			"1 tl	timjamia \n"+
			"1/2 tl	mustapippuria \n"+
			"2 tlk (à 2 dl)	Pirkka laktoositonta ruokakermaa (15%) \n"+
			"Vaihe 1\n"+
			"Kaada toinen pussi perunasuikaleita voideltuun laakeaan vuokaan. \n"+
			"Hienonna kuoritut sipulit ja valkosipulit ja levitä ne perunoiden päälle. \n"+
			"(Voit käyttää myös pakastesipulikuutioita.) Mausta suolalla (1/2 tl), timjamilla ja mustapippurilla.\n"+
			"Vaihe 2 \n"+
			"Leikkaa savuporo pieniksi kuutioiksi. Levitä savuporokuutiot ja toinen perunasuikalepussi vuokaan. \n"+
			"Ripottele pinnalle loput suolat ja kaada joukkoon ruokakerma. \n"+
			"Vaihe 3 \n"+
			"Kypsennä kiusausta uunin alatasolla 225 asteessa 30 minuuttia.\n"+
			"Laske lämpö 200 asteeseen ja kypsennä vielä 30-40 minuuttia. Tarjoa savuporokiusaus etikkapunajuurien ja raikkaan salaatin kanssa. \n";

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

				
				String avokadopasta = "AVOKADOPASTA\n"+
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
		
		System.out.print("Mitä haluat etsiä? ");
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
			System.out.println("Haulla ei löydy reseptiä.");
		}
	}

}
