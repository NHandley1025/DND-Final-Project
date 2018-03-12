package Spells;

public class spell {
	public final String name;
	public final String classReq;
	public final int spellLevel;
	
	public spell(String name, String classReq, int spellLevel) {
		super();
		this.name = name;
		this.classReq = classReq;
		this.spellLevel = spellLevel;
	}
	
	@Override
	public String toString() {
		return name + ": Class= " + classReq + " Spell Level= " + spellLevel;
	}
}
