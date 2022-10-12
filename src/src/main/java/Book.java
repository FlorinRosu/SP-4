package main.java;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }
    public int createChapter(String chapterName){
        Chapter newChapter = new Chapter(chapterName);
        chapters.add(newChapter);
        return chapters.size()-1;
    }
    public Chapter getChapter(int index){
        return chapters.get(index);
    }




}
