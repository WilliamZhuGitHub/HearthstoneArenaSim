package cardFunctions;
import java.util.ArrayList;
import java.util.Random;

/*
 * Functionality of Card sets
 * Public methods:
 * createPicks
 * returning attributes of the picks
 * 
 */
public class CardFunctions {

	Random rand = new Random();

	// add percentages of class cards vs. non class cards.
	// add percentages for spells vs minions vs weapons?
	
	//check if class matches the specified Class and Rarity
	private boolean checkIsValidClassRarity(Card card, String cardClass, String rarity) {
		if ((card.getCardClass().contains(cardClass) || card.getCardClass().contains("Any"))
				&& card.getRarity().contains(rarity)) {
			return true;
		}
		return false;

	}
	//Returns a random rarity based on RNG
	public String getRandomRarity() {
		String rarity = "";
		int randomNum = rand.nextInt(100);

		if (randomNum <= 65) {
			rarity = "Common";
		} else if (randomNum > 66 && randomNum <= 93) {
			rarity = "Rare";
		} else if (randomNum > 94 && randomNum <= 98) {
			rarity = "Epic";
		} else if (randomNum >= 99) {
			rarity = "Legendary";
		}
		return rarity;
	}
	//Returns 3 different random classes from the List
	public ArrayList<String> getRandomClasses() {
		String cardClassOne, cardClassTwo, cardClassThree = "";
		ArrayList<String> classes = new ArrayList<String>();
		ArrayList<String> classOptions = new ArrayList<String>();

		classes.add("Warrior");
		classes.add("Paladin");
		classes.add("Shaman");
		classes.add("Warlock");
		classes.add("Rogue");
		classes.add("Priest");
		classes.add("Mage");
		classes.add("Druid");
		classes.add("Hunter");
		do {
			cardClassOne = classes.get(rand.nextInt(classes.size()));
			cardClassTwo = classes.get(rand.nextInt(classes.size()));
			cardClassThree = classes.get(rand.nextInt(classes.size()));
		} while (cardClassOne == cardClassTwo || cardClassTwo == cardClassThree || cardClassThree == cardClassOne);

		classOptions.add(cardClassOne);
		classOptions.add(cardClassTwo);
		classOptions.add(cardClassThree);

		return classOptions;
	}
	//returns a random card based on class and rarity
	private Card getRandomCard(ArrayList<Card> cardList, String cardClass, String rarity) {
		Card card = new Card();
		do {
			card = cardList.get(rand.nextInt(cardList.size()));
		} while (!checkIsValidClassRarity(card, cardClass, rarity));
		return card;
	}
	//returns 3 different random cards based on class and rarity
	public ArrayList<Card> createPicks(ArrayList<Card> cardList, String cardClass, String rarity) {
		ArrayList<Card> selection = new ArrayList<Card>();
		Card card = new Card();
		CardFunctions func = new CardFunctions();
		do {
			card = func.getRandomCard(cardList, cardClass, rarity);
			// check duplicate
			if (!selection.contains(card)) {
				selection.add(card);
			}
		} while (selection.size() < 3);

		return selection;
	}

	// Return Card Name
	public String getNameAt(ArrayList<Card> picks, int number) {
		Card card = new Card();
		card = picks.get(number);
		return card.getName();

	}

	// Return card Type
	public String getTypeAt(ArrayList<Card> picks, int number) {
		Card card = new Card();
		card = picks.get(number);
		return card.getType();

	}

	// Return Card Class
	public String getClassAt(ArrayList<Card> picks, int number) {
		Card card = new Card();
		card = picks.get(number);
		return card.getCardClass();

	}
	//Return Card Rarity
	public String getRarityAt(ArrayList<Card> picks, int number) {
		Card card = new Card();
		card = picks.get(number);
		return card.getRarity();

	}
	//Return Card Cost 
	public int getCostAt(ArrayList<Card> picks, int number) {
		Card card = new Card();
		card = picks.get(number);
		return card.getCost();

	}

	public static void main(String[] args) {
		CardSets cardSet = new CardSets();
		CardFunctions func = new CardFunctions();
		ArrayList<Card> selection = new ArrayList<Card>();

		ArrayList<Card> mergeSet = new ArrayList<Card>();
		mergeSet.addAll(cardSet.classicList());
		mergeSet.addAll(cardSet.GvGList());

		for (int j = 0; j <= 30; j++) {
			System.out.print("pick " + j + " ");
			selection = func.createPicks(mergeSet, "Paladin", "Rare");
			for (int i = 0; i < selection.size(); i++) {
				System.out.print(func.getNameAt(selection, i) + " ");

			}
			System.out.println();
		}
		System.out.println("TEST END");

	}
}
