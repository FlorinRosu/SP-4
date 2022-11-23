package test;

public class Student implements Element {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;

    }

    ;

    @Override
    public void print() {
        System.out.println("            Student: " + name + "," + email);
    }

    @Override
    public Element add(Element e) {
        return null;
    }

}

