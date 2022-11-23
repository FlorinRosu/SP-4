package test;

public class Main {

    public static void main(String[] args) {
        Element info3 = new Year("Informatics 1").add(new Group("Group 1")
                .add(new Subgroup("Subgroup 1.1")
                        .add(new Student("Popescu I", "popescu123@acme.edu"))
                        .add(new Student("Popescu II", "popesc4324u@acme.edu"))


                )
        );

        Element info4 = new Year("Informatics 2").add(new Group("Group 1")
                .add(new Subgroup("Subgroup 1.1")
                                .add(new Student("Popescu 2I", "popescu123132123@acme.edu"))
                                .add(new Student("Popescu 2II", "popesc43123124u@acme.edu"))));

        info3.print();
        info4.print();

    }
}