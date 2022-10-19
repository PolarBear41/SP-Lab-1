package Carte;

import java.util.ArrayList;
import java.util.List;

public class Subchapter {
    private String name;
    private List<SubchapterItem> content = new ArrayList<>();

    public Subchapter(String name) {
        this.name = name;
    }

    public int createNewImage(String imageName) {
        content.add(new Image(imageName));
        return getLastIndex();
    }

    public int createNewParagraph(String text) {
        content.add(new Paragraph(text));
        return getLastIndex();
    }

    public int createNewTable(String title) {
        content.add(new Table(title));
        return getLastIndex();
    }

    private int getLastIndex() {
        return content.size() - 1;
    }

    public void print() {
        System.out.println("Subchapter: " + name);
		for(SubchapterItem item : content) {
			item.print();
		}
    }
}