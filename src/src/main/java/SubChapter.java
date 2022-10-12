package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class SubChapter {
    private String name;
    private List<Image> images = new ArrayList<>();
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        Paragraph newParagraph = new Paragraph(text);
        paragraphs.add(newParagraph);
    }

    public void createNewImage(String imageName) {
        Image newImage = new Image(imageName);
        images.add(newImage);
    }

    public void createNewTable(String title) {
        Table newTable = new Table(title);
        tables.add(newTable);
    }

    public void print() {
        System.out.println("Subchapter: "+name);
        for(Paragraph paragraph: paragraphs){
            paragraph.print();
        }
        for(Image image : images){
            image.print();
        }
        for(Table table: tables){
            table.print();
        }
    }
}
