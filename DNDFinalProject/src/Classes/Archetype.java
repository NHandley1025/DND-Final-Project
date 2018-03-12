package Classes;

import java.io.Serializable;

public class Archetype implements Serializable{
	
	private static final long serialVersionUID = -1258896630485334427L;
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
