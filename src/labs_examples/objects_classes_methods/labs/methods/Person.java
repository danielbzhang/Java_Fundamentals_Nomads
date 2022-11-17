package labs_examples.objects_classes_methods.labs.methods;

public class Person {
    int age;
    double height;
    String name;

    public Person(){};

    public Person(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
