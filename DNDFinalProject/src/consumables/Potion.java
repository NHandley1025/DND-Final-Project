package consumables;

import Items.Item;

public class Potion extends Item{
	
	public Potion(String name, int value, String description){
		super(name, description, "", value);
	}
	
	@Override
	public String toString() {
		return this.getName() + " : " + this.getDescription();
	}
}
