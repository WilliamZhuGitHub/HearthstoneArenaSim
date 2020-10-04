package cardFunctions;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static CardFunctions cardFunc = new CardFunctions();
	static CardSets cardSets = new CardSets();
	static DeckFunctions deckFunc = new DeckFunctions();
	static Scanner scan = new Scanner(System.in);

	/*
	 * Iterates through the ArrayList and prints the names of each card object
	 */

	public static void printListNames(ArrayList<Card> cardList) {
		CardFunctions func = new CardFunctions();
		for (int k = 0; k < cardList.size(); k++) {
			String name = "";
			name = func.getNameAt(cardList, k);
			System.out.println("pick " + (k + 1) + " was [" + name + "]");
		}
	}

	public static String pickClass(ArrayList<String> cardClasses) {
		String cardClass = "";
		boolean validPick = false;
		int pick;
		do {
			System.out.println("Pick a Class");
			System.out.println("Type 1 for the first option etc.");
			System.out.println(cardClasses);
			pick = scan.nextInt();
			if (pick == 1 || pick == 2 || pick == 3) {
				validPick = true;
			}
		} while (!validPick);
		if (pick == 1) {
			cardClass = cardClasses.get(0);
		} else if (pick == 2) {
			cardClass = cardClasses.get(1);

		} else if (pick == 3) {
			cardClass = cardClasses.get(2);
		}
		return cardClass;
	}

	public static int averageManaCost(ArrayList<Card> cardList) {
		int average = 0;
		Card card = new Card();
		for (int k = 0; k < cardList.size(); k++) {
			card = cardList.get(k);
			average += card.getCost();
		}
		average = average / cardList.size();
		return average;
	}
	public static void run() {
		// add the sets that will be used
				ArrayList<Card> mergeSet = new ArrayList<Card>();
				/*
				 * In the future turn the lists into booleans and have the user click to 
				 * choose which sets to include.
				 */
				mergeSet.addAll(cardSets.classicList());
				mergeSet.addAll(cardSets.basicList());
				mergeSet.addAll(cardSets.GvGList());
				mergeSet.addAll(cardSets.GTList());
				mergeSet.addAll(cardSets.GvGList());
				mergeSet.addAll(cardSets.JtUList());
				mergeSet.addAll(cardSets.KaCList());
				mergeSet.addAll(cardSets.KotFTList());
				mergeSet.addAll(cardSets.LOEList());
				mergeSet.addAll(cardSets.MSoGList());
				mergeSet.addAll(cardSets.ONiKList());
				mergeSet.addAll(cardSets.RoSList());
				mergeSet.addAll(cardSets.SoUList());


				System.out.println("Welcome to Hearthstone ArenaSim");
				
				// User picks a class from a list of randomly generated classes
				String cardClass = pickClass(cardFunc.getRandomClasses());
				System.out.println("You've chosen: " + cardClass);

				ArrayList<Card> selection = new ArrayList<Card>();
				ArrayList<Card> deck = new ArrayList<Card>();
				ArrayList<Card> notChosen = new ArrayList<Card>();

				boolean valid = false;
				/*
				 * -Selection- Card will be randomly selected from a grouping of cardSets <Card>
				 * if the card has the correct rarity/class it will be added to selection list
				 * cards chosen will be added to deck list cards not chosen will be added to
				 * notChosen list
				 */
				for (int j = 1; j <= 30; j++) {
					String cardRarity = cardFunc.getRandomRarity();
		  			selection = cardFunc.createPicks(mergeSet, cardClass, cardRarity);
		 
					do {
						System.out.print("Rarity: " + cardRarity + " Pick: " + j + " ");
						
						for (int i = 0; i < selection.size(); i++) {
							// Prints cardNames of selection
							//System.out.print("(" + (i+1) + ") [" + cardFunc.getNameAt(selection, i) + "] ");
							System.out.print("[" + cardFunc.getNameAt(selection, i) + "] " );

//		 				Test print class, rarity
//						System.out.print(cardFunc.getClassAt(selection, i) + " ");
//						System.out.print(cardFunc.getRarityAt(selection, i) + " ");

						} // end for 0-selection size
		 

						System.out.println();

						int pick = scan.nextInt();
						// Adds to arrayLists deck, notChosen based on input
						if (pick == 1) {
							deck.add(selection.get(0));
							notChosen.add(selection.get(1));
							notChosen.add(selection.get(2));

							valid = true;
						} else if (pick == 2) {
							notChosen.add(selection.get(0));
							deck.add(selection.get(1));
							notChosen.add(selection.get(2));

							valid = true;
						} else if (pick == 3) {
							notChosen.add(selection.get(0));
							notChosen.add(selection.get(1));
							deck.add(selection.get(2));

							valid = true;
						}
					} while (!valid);

					valid = false;
				} // end for 0-30

		// Test Print decklist
				System.out.println("Your deck is: ");
				printListNames(deck);
//				deckFunc.sortList(deck);
//				System.out.println("Sorted Deck is: ");
//				deckFunc.printListNames(deck);
		// Test Print notChosenlist
				// System.out.println("Not chosen cards were: ");
				// printListNames(notChosen);
		//Test average mana cost;
				System.out.println("Your average ManaCost was " + averageManaCost(deck));
				System.out.println("TEST END");

				scan.close();
			
	}

	public static void main(String[] args) {
		run();
	}
}
