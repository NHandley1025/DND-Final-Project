package Weapons;

import Items.Item;

public class weapon extends Item {
	private static final long serialVersionUID = -9025817486072899595L;
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
	
	@Override
	public String toString() {
		return getName() + ": Value=" + getValue() + ", Weight=" + getWeight() + ", Damage=" + getDamage() + ", Damage Type=" + getDamageType() + ", Classification=" + getClassification(); 
	}
	
}
