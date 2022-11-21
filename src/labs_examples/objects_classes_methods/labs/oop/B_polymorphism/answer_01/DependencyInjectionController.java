package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.answer_01;

public class DependencyInjectionController {
    public static void main(String[] args) {
        Scooter scoot = new Scooter();
        Sedan toyota = new Sedan("Toyota", "Prius", 5643, "Silver");
        Dependency depend = new Dependency(toyota);

        depend.setTransport(toyota);
        toyota.start(100);
        depend.testMethods();


        depend.setTransport(scoot);
        depend.testMethods();
    }
}
