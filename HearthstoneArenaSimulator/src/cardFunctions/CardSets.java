package cardFunctions;

import java.util.ArrayList;

import cardSets.CardSetBasic;
import cardSets.CardSetClassic;
import cardSets.CardSetGT;
import cardSets.CardSetGvG;
import cardSets.CardSetJTU;
import cardSets.CardSetKaC;
import cardSets.CardSetKotFT;
import cardSets.CardSetLOE;
import cardSets.CardSetMSoG;
import cardSets.CardSetONiK;
import cardSets.CardSetRoS;
import cardSets.CardSetSoU;

public class CardSets {
	public ArrayList<Card> basicList() {
		CardSetBasic basic = new CardSetBasic();
		return basic.basicList();
	}

	public ArrayList<Card> classicList() {
		CardSetClassic classic = new CardSetClassic();
		return classic.classicList();
	}

	public ArrayList<Card> GvGList() {
		CardSetGvG GVG = new CardSetGvG();
		return GVG.gvgList();
	}

	public ArrayList<Card> GTList() {
		CardSetGT grandTournament = new CardSetGT();
		return grandTournament.GrandTournamentList();
	}

	public ArrayList<Card> JtUList() {
		CardSetJTU JtU = new CardSetJTU();
		return JtU.JTUList();
	}

	public ArrayList<Card> KotFTList() {
		CardSetKotFT KotFT = new CardSetKotFT();
		return KotFT.KotFTList();
	}

	public ArrayList<Card> KaCList() {
		CardSetKaC KaC = new CardSetKaC();
		return KaC.KaCList();

	}

	public ArrayList<Card> LOEList() {
		CardSetLOE LoE = new CardSetLOE();
		return LoE.LoEList();

	}
	public ArrayList<Card> MSoGList() {
		CardSetMSoG MSoG = new CardSetMSoG();
		return MSoG.MSoGList();

	}
	public ArrayList<Card> ONiKList() {
		CardSetONiK ONiK = new CardSetONiK();
		return ONiK.ONiKList();

	}
	public ArrayList<Card> RoSList() {
		CardSetRoS RoS = new CardSetRoS();
		return RoS.RoSList();

	}
	public ArrayList<Card> SoUList() {
		CardSetSoU SoU = new CardSetSoU();
		return SoU.SoUList();

	}
}
