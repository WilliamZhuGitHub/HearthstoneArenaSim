package cardFunctions;
/*
 * Card Constructor
 * All Card objects will have: Name/Rarity/Type/SubType/Class/Cost/Description
 */
public class Card {
	private String name;
	private String rarity;
	private String type;
	private String subType;
	private String cardClass;
	private int cost;
	private String effect;

	public Card() {
		this.name = null;
		this.rarity = null;
		this.type = null;
		this.subType = null;
		this.cardClass = null;
		this.cost = 0;
		this.effect = null;
	}

	public Card(String name, String rarity, String type, String subType, String cardClass, int cost) {
		this.name = name;
		this.rarity = rarity;
		this.type = type;
		this.subType = subType;
		this.cardClass = cardClass;
		this.cost = cost;
		this.effect = effect;
	}

	public String getRarity() {
		return rarity;
	}

	public String getSubType() {
		return subType;
	}

	public int getCost() {
		return cost;
	}

	public String getName() {
		return name;

	}

	public String getType() {
		return type;

	}

	public String getCardClass() {
		return cardClass;
	}
	public String getEffect() {
		return effect;
	}
}
