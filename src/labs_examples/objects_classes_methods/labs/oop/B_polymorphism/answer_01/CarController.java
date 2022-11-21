package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.answer_01;

public class CarController {
    public static void main(String[] args) {
        Scooter scoot = new Scooter();
        scoot.accelerate(20);

        Sedan toyota = new Sedan("Toyota", "Prius", 5643, "Silver");
        toyota.accelerate(30.57);
    }
}
