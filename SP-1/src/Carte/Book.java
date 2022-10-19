package Carte;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors = new ArrayList<>();
	private List<Chapter> chapters = new ArrayList<>();

	public Book(String title) {
		this.title = title;
	}

	public void addAuthor(Author author) {
		this.authors.add(author); 
	}

	public int createChapter(String title) {
		chapters.add(new Chapter(title));
		return chapters.size() - 1;
	}

	public Chapter getChapter(int index) {
		return chapters.get(index);
	}

	public void print() {
		System.out.println("Title: " + title);
		for (Author a : authors) {
			a.print();
		}
		for (Chapter c : chapters) {
			c.print();
		}
	}
}