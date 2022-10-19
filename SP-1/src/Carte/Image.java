package Carte;

public class Image implements SubchapterItem {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        System.out.println("Image with Name: " + imageName);        
    }
    
}