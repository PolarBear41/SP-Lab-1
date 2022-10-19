package Carte;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<Subchapter> subchapters = new ArrayList<>();
    
    public Chapter(String name) {
        this.name = name;
    }
    
    public int createSubchapter(String name) {
        this.subchapters.add(new Subchapter(name));
        return this.subchapters.size() - 1;
    }
    
    public Subchapter getSubchapter(int index) {
        return subchapters.get(index);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for(Subchapter s : subchapters) {
            s.print();
        }
    }

}