package armor;

import Items.Item;

public class Armor extends Item {

	protected int baseAC;
	protected Integer maxDexMod;
	protected int strRequriement;
	protected boolean stealthDisatvantage;
	
	public Armor(String name, String value, int baseAC, int strRequirement, boolean stealthDisatvantage, int weight,Integer maxDexMod, String description) {
		super(name, description, value, weight);
		this.baseAC = baseAC;
		this.maxDexMod = maxDexMod;
		this.strRequriement = strRequirement;
		this.stealthDisatvantage = stealthDisatvantage;
	}

	public int getBaseAC() {
		return baseAC;
	}

	public Integer getMaxDex() {
		return maxDexMod;
	}

	public int getStrRequriement() {
		return strRequriement;
	}

	public boolean isStealthDisatvantage() {
		return stealthDisatvantage;
	}
	
	
}
