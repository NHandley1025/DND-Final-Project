package Traits;

public class Trait{
	private String keyword;
	private String description;
	public Trait(String keyword, String description) {
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

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
