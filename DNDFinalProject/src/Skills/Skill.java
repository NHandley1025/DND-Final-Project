package Skills;

import java.io.Serializable;

public class Skill implements Serializable{
	private static final long serialVersionUID = 1450228353177559415L;
	private String name;
	private String Description;
	
	public Skill(String name, String description) {
		setName(name);
		setDescription(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	
	
}
