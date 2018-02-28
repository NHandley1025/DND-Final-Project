package Traits;

public class Background {
	private Bond bond;
	private Personality personalityTraits;
	private Ideal ideals;
	private Flaw flaws;
	private String name;
	
	public Background(String name) {
		setName(name);
		Backgrounds.get(name);
	}
	
	public void setName(String name) {
		if(Backgrounds.getHash().containsKey(new TraitKey(name, null))) {
			this.name = name;
		}else {
			this.name = "Chosen One";
		}
	}
	
}
