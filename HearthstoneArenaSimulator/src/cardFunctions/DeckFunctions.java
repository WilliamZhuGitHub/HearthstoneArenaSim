package cardFunctions;
import java.util.ArrayList;
/*
 * Data of deck returned to user
 * -decklist
 * >sort deck by mana curve?
 * -avarage curve
 * -number of each cost card
 * -number of each cost if repeat?
 */

public class DeckFunctions {
	public void printListNames(ArrayList<Card> cardList) {
		CardFunctions func = new CardFunctions();
		for (int k = 0; k < cardList.size(); k++) {
			String name = "";
			name = func.getNameAt(cardList, k);
			int manaCost = func.getCostAt(cardList,k);
			System.out.println("pick " + (k + 1) + " was [" + name + "]" + "ManaCost was " + manaCost );
		}
	}

	public double averageManaCost(ArrayList<Card> cardList) {
		double average = 0;
		Card card = new Card();
		for (int k = 0; k < cardList.size(); k++) {
			card = cardList.get(k);
			average = average + card.getCost();
		}
		average = average / cardList.size();
		return average;
	}
	//sorted by cost in ascending order
	public ArrayList<Card> sortList(ArrayList<Card> cardList) {
		ArrayList<Card> sortList =  new ArrayList<Card>();
		Card min = cardList.get(0);

 		for (int i =  1; i < cardList.size();i++) {
			if(cardList.get(i++) != null && cardList.get(i).getCost() < min.getCost()) {
				min = cardList.get(i);
				sortList.add(min);
				
			}

			
		}
		return sortList;
	}

	public ArrayList<Card> removeDuplicate(ArrayList<Card> cardList) {

		// System.out.println("[copies] " + cardName);
		return cardList;
	}

	public static void main(String[] args) {
		// int numCost1, numCost2, numCost3, numCost4, numCost5, numCost6, numCost7,
		// numCost8, numCost9, numCost10More;
		ArrayList<Card> classic = new ArrayList<Card>();
		classic.add(new Minion("Abomination", " Rare", " Minion", " General", "  Any", 5, 4, 4));
		classic.add(new Minion("Abusive Sergeant", " Common", " Minion", " General", "  Any", 1, 1, 1));
		classic.add(new Minion("Acolyte of Pain", " Common", " Minion", " General", "  Any", 3, 1, 3));
		classic.add(new Minion("Al'Akir the Windlord", " Legendary", " Minion", " Elemental", "  Shaman", 8, 3, 5));
		classic.add(new Minion("Alarm-o-Bot", " Rare", " Minion", " Mech", "  Any", 3, 0, 3));
		classic.add(new Minion("Aldor Peacekeeper", " Rare", " Minion", " General", "  Paladin", 3, 3, 3));
		classic.add(new Minion("Alexstrasza", " Legendary", " Minion", " Dragon", "  Any", 9, 8, 8));
		
		DeckFunctions deckFunc = new DeckFunctions();
		deckFunc.sortList(classic);
		deckFunc.printListNames(classic);
		
	}

}
