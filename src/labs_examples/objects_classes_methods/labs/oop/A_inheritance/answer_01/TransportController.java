package labs_examples.objects_classes_methods.labs.oop.A_inheritance.answer_01;

public class TransportController {
    public static void main(String[] args) {
        Car prius = new Car(100.33, 5, 90, "Toyota", "Prius", true, "Silver", "2006");
        prius.honk();

        EV tesla = new EV(88.73, 5, 74, "Tesla", "X94", false, "Red", "2020", 5.4);
        tesla.honk();
    }
}
