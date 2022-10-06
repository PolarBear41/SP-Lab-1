package Carte;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String Title;
    public List<String> paragraphs;
    public List<String> images;
    public List<String> tables;
    public Book(String title)
    {
        Title = title;
        paragraphs = new ArrayList<String>();
        images = new ArrayList<String>();
        tables = new ArrayList<String>();
    }
    public void createNewParagraph(String content)
    {
        paragraphs.add(content);
    }

    public void createNewImage(String content)
    {
        images.add(content);
    }

    public void createNewTable(String content)
    {
        tables.add(content);
    }

    public void print()
    {
       String output = Title+ "\n"
                + String.join("\n" , paragraphs) + "\n"
                + String.join("\n" , images) + "\n"
                + String.join("\n" , tables);
        System.out.println(output);
    }


}
