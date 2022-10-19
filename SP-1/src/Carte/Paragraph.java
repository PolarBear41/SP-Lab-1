package Carte;

public class Paragraph implements SubchapterItem {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragrapg: " + text);        
    }
}