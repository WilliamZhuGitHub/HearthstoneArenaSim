package cardFunctions;

public class Weapon extends Card {
	private String name;
	private String rarity;
	private String type;
	private String subType;
	private String cardClass;
	private int cost;
	private int attack;
	private int durability;

	public Weapon() {
		this.name = null;
		this.rarity = null;
		this.type = null;
		this.subType = null;
		this.cardClass = null;
		this.cost = 0;
		this.attack = 0;
		this.durability = 0;
	}

	public Weapon(String name, String rarity, String type, String subType, String cardClass, int cost, int attack,
			int durability) {
		// TODO Auto-generated constructor stub

		this.name = null;
		this.rarity = null;
		this.type = null;
		this.subType = null;
		this.cardClass = null;
		this.cost = 0;
		this.attack = 0;
		this.durability = 0;
	}
// Order is name, rarity, type, subType, class, cost, attack, durability;

	public String getRarity() {
		return rarity;
	}

	public String getSubType() {
		return subType;
	}

	public int getDurability() {
		return durability;
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
