package Spells;

import java.io.Serializable;

public class spell implements Serializable {
	private static final long serialVersionUID = -8656227305745880771L;
	public final String name;
	public final String classReq;
	public final int spellLevel;
	
	public spell(String name, String classReq, int spellLevel){
		super();
		this.name = name;
		this.classReq = classReq;
		this.spellLevel = spellLevel;
	}
	
}
