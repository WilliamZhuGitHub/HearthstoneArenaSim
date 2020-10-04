package cardFunctions;

public class Minion extends Card {
	private String name;
	private String rarity;
	private String type;
	private String subType;
	private String cardClass;
	private int cost;
	private int attack;
	private int health;

	public Minion() {

		this.name = null;
		this.rarity = null;
		this.type = null;
		this.subType = null;
		this.cardClass = null;
		this.cost = 0;
		this.attack = 0;
		this.health = 0;
	}
	// Order is name, rarity, type, subType, class, cost, attack, health;

	public Minion(String name, String rarity, String type, String subType, String cardClass, int cost, int attack,
			int health) {
		this.name = name;
		this.rarity = rarity;
		this.type = type;
		this.subType = subType;
		this.cardClass = cardClass;
		this.cost = cost;
		this.attack = attack;
		this.health = health;

	}

	public String getRarity() {
		return rarity;
	}

	public String getSubType() {
		return subType;
	}

	public int getHealth() {
		return health;
	}

	public int getAttack() {
		return attack;
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
