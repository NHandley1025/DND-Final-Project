package armor;

import Items.Item;

public class Armor extends Item {

	protected int baseAC;
	protected Integer maxDex;
	protected int strRequriement;
	protected boolean stealthDisatvantage;
	
	public Armor(String name, String description, String value, int weight, int baseAC, Integer maxDex, int strRequirement, boolean stealthDisatvantage) {
		super(name, description, value, weight);
		this.baseAC = baseAC;
		this.maxDex = maxDex;
		this.strRequriement = strRequirement;
		this.stealthDisatvantage = stealthDisatvantage;
	}

	public int getBaseAC() {
		return baseAC;
	}

	public Integer getMaxDex() {
		return maxDex;
	}

	public int getStrRequriement() {
		return strRequriement;
	}

	public boolean isStealthDisatvantage() {
		return stealthDisatvantage;
	}
	
	
}
