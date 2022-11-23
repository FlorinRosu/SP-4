package test;

import java.util.ArrayList;
import java.util.List;

public class Group implements Element {

    String name;
    private List<Element> subgroups = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public Element add(Element s) {
        this.subgroups.add(s);
        return this;
    }

    @Override
    public void print() {
        System.out.println("    Group: " + name);
        for (Element e : subgroups) {
            e.print();
        }
    }

}
