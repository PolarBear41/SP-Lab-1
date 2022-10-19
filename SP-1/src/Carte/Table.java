package Carte;

public class Table implements SubchapterItem {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Table with Title: " + title);        
    }
}