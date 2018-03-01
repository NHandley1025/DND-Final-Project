package Weapons;

import Items.Item;

public class weapon extends Item {

	protected String damage;
	protected String classification;
	protected String damageType;
	
	
	public weapon(String name, String value, String damage, String damageType, int weight, String classification) {
		super(name, "", value, weight);
		this.damage = damage;
		this.classification = classification;
		this.damageType = damageType;
	}
	
	public String getDamage() {
		return damage;
	}
	
	public String getClassification() {
		return classification;
	}
	
	public String getDamageType() {
		return damageType;
	}
	
}
