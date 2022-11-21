package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.answer_01;

public class Vehicle implements MotorizedTransport{
    protected String make;
    protected String model;
    protected double miles;
    public final double PI = 3.1415926;

    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

    @Override
    public boolean start() {
        System.out.println("starting vehicle");
        return true;
    }

    @Override
    public void stop() {
        System.out.println("Stopping vehicle");
    }

    @Override
    public void accelerate(double mph) {
        System.out.println("accelerating vehicle");
    }

    @Override
    public void decelerate(double mph) {
        System.out.println("decelerating vehicle");
    }
}
