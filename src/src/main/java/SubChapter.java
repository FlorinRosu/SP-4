package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class SubChapter {
    private String name;


    private List<Element> elements = new ArrayList<>();

//    private List<Image> images = new ArrayList<>();
//    private List<Paragraph> paragraphs = new ArrayList<>();
//    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        Paragraph newParagraph = new Paragraph(text);
        elements.add(newParagraph);
    }

    public void createNewImage(String imageName) {
        Image newImage = new Image(imageName);
        elements.add(newImage);
    }

    public void createNewTable(String title) {
        Table newTable = new Table(title);
        elements.add(newTable);
    }


    public void print(){
        System.out.println("Subchapter: "+name);

        for(Element element:elements){
            element.print();
        }
    }

//    public void print() {
//        System.out.println("Subchapter: "+name);
//        for(Paragraph paragraph: paragraphs){
//            paragraph.print();
//        }
//        for(Image image : images){
//            image.print();
//        }
//        for(Table table: tables){
//            table.print();
//        }
//    }
}
