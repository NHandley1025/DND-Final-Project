package Items;

import java.io.Serializable;

public class Item implements Serializable{
	private static final long serialVersionUID = 3490899057181886652L;
	private String name;
	private String description;
	private String value;
	private int weight;
	
	public Item(String name, String description, String value, int weight) {
		this.name = name;
		this.description = description;
		this.value = value;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getValue() {
		return value;
	}

	public int getWeight() {
		return weight;
	}
	
	public int[] ConvertValue() {
		return null;
	}
	
	
}
