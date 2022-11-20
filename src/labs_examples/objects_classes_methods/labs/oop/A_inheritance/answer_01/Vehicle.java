package labs_examples.objects_classes_methods.labs.oop.A_inheritance.answer_01;

public class Vehicle extends Transport {

    private String make;

    public Vehicle(double speed, int passengerCapacity, double horsePower, String make) {
        super(speed, passengerCapacity, horsePower);
        this.make = make;
    }

    public void honk() {
        System.out.println("Vehicle honking...");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
