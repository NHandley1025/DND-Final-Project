package keys;

public class spellKey {
	public final Integer spellLevel;
	public final String name;
	public final String classReq[];
	
	public spellKey(Integer spellLevel, String name, String... classReq) {
		super();
		this.spellLevel = spellLevel;
		this.name = name;
		this.classReq = classReq;
	}
	
	public boolean isFilter() {
		boolean isFilter;
		isFilter = spellLevel == null || name == null || classReq.length == 0 || classReq.length == 1;
		return isFilter;
	}
	
	@Override
	//needs accomodation for classReq's String[]
	public boolean equals(Object o) {
		boolean equal = false;
		if(!(o instanceof spellKey)) {
			spellKey test = (spellKey)(o);
			int selection = 0;
			if(spellLevel != null) {
				selection += 1;
			}
			if(name != null) {
				selection += 3;
			}
			if(classReq != null) {
				selection += 5;
			}
			switch(selection) {
			case 0: equal = true;
			break;
			case 1: equal = spellLevel.equals(test.spellLevel);
			break;
			case 3: equal = name.equals(test.name);
			break;
			case 4: equal = spellLevel.equals(test.spellLevel) && name.equals(test.name);
			break;
			case 5: equal = classReq.equals(test.classReq);
			break;
			case 6: equal = classReq.equals(test.classReq) && spellLevel.equals(test.spellLevel);
			break;
			case 8: equal = classReq.equals(test.classReq) && name.equals(test.name);
			break;
			case 9: equal = classReq.equals(test.classReq) && name.equals(test.name) && spellLevel.equals(test.spellLevel);
			break;
			}
		}
		return equal;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
}
