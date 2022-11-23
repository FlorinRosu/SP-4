package test;

import java.util.ArrayList;
import java.util.List;

public class Subgroup implements Element {
    String name;
    private List<Element> students = new ArrayList<>();

    public Subgroup(String name) {
        this.name = name;
    }

    public Element add(Element s) {
        students.add(s);
        return this;

    }

    @Override
    public void print() {
        System.out.println("        Subgroup: " + name);
        for (Element e : students) {
            e.print();
        }
    }
}
