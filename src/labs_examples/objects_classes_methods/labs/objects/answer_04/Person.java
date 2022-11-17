package labs_examples.objects_classes_methods.labs.objects.answer_04;

public class Person {
    // demonstrate at least three overloaded constructors

    public Person() {};

    String name;
    String nationality;
    double height;
    boolean isMale;

    public Person(String name, String nationality, double height, boolean isMale) {
        this.name = name;
        this.nationality = nationality;
        this.height = height;
        this.isMale = isMale;
    }

    public Person(boolean isMale) {
        this.isMale = isMale;
    }
}
