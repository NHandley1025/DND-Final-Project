package tools;

import Items.Item;

public class Tool extends Item{

	public Tool(String name, String description) {
		super(name, description, "", 0);
		
	}

	@Override
	public String toString() {
		return this.getName() + " : " + this.getDescription();
	}
	
	

}
