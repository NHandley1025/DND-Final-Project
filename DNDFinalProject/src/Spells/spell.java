package Spells;

public class spell {
	public final String name;
	public final String effect;
	public final String classReq;
	public final int spellLevel;
	
	public spell(String name, String effect, String classReq, int spellLevel) {
		super();
		this.name = name;
		this.effect = effect;
		this.classReq = classReq;
		this.spellLevel = spellLevel;
	}
	
}
