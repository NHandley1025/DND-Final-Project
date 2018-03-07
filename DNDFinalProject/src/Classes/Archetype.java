package Classes;



public class Archetype extends Class{

	private String name;
	
	public Archetype(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
}
