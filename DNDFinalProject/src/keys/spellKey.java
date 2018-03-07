package keys;

public class spellKey {
	public final Integer spellLevel;
	public final String name;
	public final String classReq;
	
	public spellKey(int spellLevel, String name, String classReq) {
		super();
		this.spellLevel = spellLevel;
		this.name = name;
		this.classReq = classReq;
	}
	
	public boolean isFilter() {
		boolean isFilter;
		isFilter = spellLevel == null || name == null || classReq == null;
		return isFilter;
	}
	
	
}
