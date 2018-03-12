package Races;

import java.io.Serializable;
import java.util.ArrayList;

import Skills.Skill;

public class Race implements Serializable{
	private static final long serialVersionUID = -5630180854436653449L;
	protected int weight;
	protected int height;
	protected String size;
	protected int landBaseSpeed;
	protected ArrayList<Skill> racialSkills = new ArrayList<>();
	public int[] racialModifiers = new int[6];
	protected String name;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getLandBaseSpeed() {
		return landBaseSpeed;
	}
	public void setLandBaseSpeed(int landBaseSpeed) {
		this.landBaseSpeed = landBaseSpeed;
	}
	public ArrayList<Skill> getRacialSkills() {
		return racialSkills;
	}
	public void setRacialSkills(ArrayList<Skill> racialSkills) {
		this.racialSkills = racialSkills;
	}
	public int[] getRacialModifiers() {
		return racialModifiers;
	}
	public void setRacialModifiers(int[] racialModifiers) {
		this.racialModifiers = racialModifiers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
