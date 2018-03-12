package tools;

import Items.Item;

public class Tool extends Item{
	private static final long serialVersionUID = 1618893854350065907L;

	public Tool(String name, String description) {
		super(name, description, "", 0);
		
	}

	@Override
	public String toString() {
		return this.getName() + " : " + this.getDescription();
	}
	
	

}
