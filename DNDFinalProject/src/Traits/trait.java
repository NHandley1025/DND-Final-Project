package Traits;

import java.io.Serializable;

public class trait implements Serializable{
	private String keyword;
	private String description;
	public trait(String keyword, String description) {
		this.keyword = keyword;
		this.description = description;
	}
	
	public String getKeyword() {
		return keyword;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(keyword);
		sb.append(" - ").append(description);
		return sb.toString();
	}
	
}
