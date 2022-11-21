package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.answer_01;

public class Dependency {

    // dependency injection
    MotorizedTransport transport;

    public Dependency(MotorizedTransport transport) {
        this.transport = transport;
    }

    public void testMethods() {
        transport.start();
        transport.stop();
        transport.accelerate(43.39);
        transport.decelerate(30.95);
        System.out.println("---------------------------------");
    }

    public void setTransport(MotorizedTransport transport) {
        this.transport = transport;
    }
}
