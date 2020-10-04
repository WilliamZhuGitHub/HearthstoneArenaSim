package cardFunctions;

public class Spell extends Card {
	private String name;
	private String rarity;
	private String type;
	private String subType;
	private String cardClass;
	private int cost;

	private String emptySpace;
	private String emptySpaceTwo;

	public Spell() {

		this.name = null;
		this.rarity = null;
		this.type = null;
		this.subType = null;
		this.cardClass = null;
		this.cost = 0;

	}
	// Order is name, rarity, type, subtype, class, cost, null, null

	public Spell(String name, String rarity, String type, String subType, String cardClass, int cost, String emptySpace,
			String emptySpaceTwo) {
		this.name = name;
		this.rarity = rarity;
		this.type = type;
		this.subType = subType;
		this.cardClass = cardClass;
		this.cost = cost;
		this.emptySpace = null;
		this.emptySpaceTwo = null;

	}

	public String getRarity() {
		return rarity;
	}

	public String getSubType() {
		return subType;
	}

	public String getEmptySpaceTwo() {
		return emptySpaceTwo;
	}

	public String getEmptySpace() {
		return emptySpace;
	}

	public int getCost() {
		return cost;
	}

	public String getName() {
		return name;

	}

//	public int getRating() {
//		return rating;
//	}

	public String getType() {
		return type;

	}

	public String getCardClass() {
		return cardClass;
	}

	public void printOut() {
		System.out.println("Card type is: " + type);
		System.out.println("Card Name is " + name);
	}

}
