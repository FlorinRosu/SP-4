package main.java;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String chapterName;
    private List<SubChapter> subChapters = new ArrayList<>();
    public Chapter(String chapterName) {
        this.chapterName = chapterName;
    }
    public int createSubChapter(String subChapterName){
        SubChapter newSC = new SubChapter(subChapterName);
        subChapters.add(newSC);
        return subChapters.size()-1;
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }
}
