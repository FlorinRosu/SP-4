package main.java;

public class DocumentManager {

    private static DocumentManager instance = null;
    private Book book=null;


    private DocumentManager(){
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static DocumentManager getInstance(){
        if (instance==null)
            instance = new DocumentManager();

        return instance;
    }



}
