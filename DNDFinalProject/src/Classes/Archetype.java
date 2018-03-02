package Classes;

import java.awt.List;
import java.util.ArrayList;

import Skills.Skill;

public class Archetype {

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
