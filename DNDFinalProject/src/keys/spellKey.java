package keys;

public class spellKey {
	private final Integer spellLevel;
	private final String name;
	private final String classReq;
	
	public spellKey(int spellLevel, String name, String classReq) {
		super();
		this.spellLevel = spellLevel;
		this.name = name;
		this.classReq = classReq;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		spellKey key = (spellKey) obj;
		if (key.getName() == this.name)
			return true;
		else return false;
	}
	
	
	
	public Integer getSpellLevel() {
		return spellLevel;
	}



	public String getName() {
		return name;
	}



	public String getClassReq() {
		return classReq;
	}



	public boolean isFilter() {
		boolean isFilter;
		isFilter = spellLevel == null || name == null || classReq == null;
		return isFilter;
	}
	
	
}
