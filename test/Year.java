package test;

import java.util.ArrayList;
import java.util.List;

public class Year implements Element {
    String name;
    private List<Element> groups = new ArrayList<>();

    public Year(String name) {
        this.name = name;
    }

    public Element add(Element g) {
        this.groups.add(g);
        return this;
    }

    public void print() {
        System.out.println("Year: " + name);
        for (Element e : groups) {
            e.print();
        }
    }
}
