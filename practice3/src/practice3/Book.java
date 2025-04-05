package practice3;

public class Book {
	String title;
	String author;
	int pages;
	
	public String getRank() {
		if (pages >= 300) {
			return "長編";
		} else if (pages >= 150) {
			return "中編";
		} else if (pages >= 1) {
			return "短編";
		} else {
			return "不明";
		}
	}
	
	public String toString() {
		return title + "|" + author + "|" + pages + "|" + getRank();
	}

}
