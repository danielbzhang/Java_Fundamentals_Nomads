package labs_examples.objects_classes_methods.labs.objects.answer_04;

public class Controller {
    public static void main(String[] args) {
        //create at least 3 objects of your POJO class, each using
        //a different constructor.

        Person nick = new Person();
        Person bob = new Person(true);
        Person brett = new Person("Brett", "American", 6.2, true);
    }
}
