
import java.util.Scanner;

/**
* Lihareseptit.
* @param luku Käyttäjän syöttämä luku, mitä reseptejä hän haluaa katsoa.
* @param karjalanpaisti Karjalanpaisti-resepti
* @param kinkkupasta Kinkkupastan resepti
* @param savuporokiusaus Savuporokiusauksen resepti
*/

public class liha {
	public static void lihaReseptit() {
		
			int luku = 0;
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

			
			Scanner lukija = new Scanner(System.in);
			
			System.out.println("\n LIHARESEPTIT \n");
			System.out.println("* " + "1 - Karjalanpaisti");
			System.out.println("* " + "2 - Kinkkupasta");
			System.out.println("* " + "3 - Savuporokiusaus");
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
				System.out.println(karjalanpaisti); 
				System.out.println("*** Palataan takaisin valikkoon ***"); 
					liha.lihaReseptit();
				break;
			case 2:
				System.out.println(kinkkupasta);
				System.out.println("*** Palataan takaisin valikkoon ***"); 
				liha.lihaReseptit(); 
				break;
			case 3:
				System.out.println(savuporokiusaus); 
				System.out.println("*** Palataan takaisin valikkoon ***"); 
				liha.lihaReseptit();
				break;
			case 4:
				ekavalikko.alku();
				break;
				}
			 
			}
		}