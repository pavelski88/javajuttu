
import java.util.Scanner;

/**
* Lihareseptit.
* @param luku K�ytt�j�n sy�tt�m� luku, mit� reseptej� h�n haluaa katsoa.
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

			
			Scanner lukija = new Scanner(System.in);
			
			System.out.println("\n LIHARESEPTIT \n");
			System.out.println("* " + "1 - Karjalanpaisti");
			System.out.println("* " + "2 - Kinkkupasta");
			System.out.println("* " + "3 - Savuporokiusaus");
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