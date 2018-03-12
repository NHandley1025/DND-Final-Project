package consumables;

import Items.Item;

public class Potion extends Item{
	private static final long serialVersionUID = 3264650470511040680L;

	public Potion(String name, int value, String description){
		super(name, description, "", value);
	}
	
	@Override
	public String toString() {
		return this.getName() + " : " + this.getDescription();
	}
}
