package keys;

import java.util.Objects;

public class TraitKey {
	private String backgroundName;
	private String keyword;
	
	public TraitKey(String backgroundName, String keyword){
		if(backgroundName == null && keyword == null) {
			throw new IllegalArgumentException("The retrieving key cannot have both values be null");
		}
		this.keyword = keyword;
		this.backgroundName = backgroundName;
	}
	
	
	
	public String getBackgroundName() {
		return backgroundName;
	}



	public String getKeyword() {
		return keyword;
	}
	
	public boolean isFilter() {
		boolean isFilter = backgroundName == null || keyword == null;
		return isFilter;
	}

	@Override
	public boolean equals(Object o) {
		boolean equals = false;
		if(!(o instanceof TraitKey)) {
			TraitKey temp = (TraitKey)o;
			//see if one is null
			if(this.getBackgroundName() == null || this.getKeyword() == null) {
				if(this.getBackgroundName() == null) {
					equals = temp.getKeyword().equals(this.getKeyword());
				}else if(this.getKeyword() == null){
					equals = temp.getBackgroundName().equals(this.getBackgroundName());
				}else {
					equals = true;
				}
			}else {
				equals = temp.getKeyword().equals(this.getKeyword()) && temp.getBackgroundName().equals(this.getBackgroundName());
			}
		}
		return equals;
	}
	
	@Override
	public int hashCode() {
		int result = Objects.hashCode(keyword);
		int modifier = Objects.hashCode(backgroundName);
		result = 163 * result + modifier;
		return result;
	}
}
