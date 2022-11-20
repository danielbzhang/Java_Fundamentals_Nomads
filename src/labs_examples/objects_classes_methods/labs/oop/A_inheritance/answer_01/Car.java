package labs_examples.objects_classes_methods.labs.oop.A_inheritance.answer_01;

public class Car extends Vehicle{
    private String model;
    private boolean isHybrid;
    private String color;
    private String year;

    public Car(double speed, int passengerCapacity, double horsePower, String make, String model, boolean isHybrid, String color, String year) {
        super(speed, passengerCapacity, horsePower, make);
        this.model = model;
        this.isHybrid = isHybrid;
        this.color = color;
        this.year = year;
    }

    @Override
    public void honk() {
        System.out.println("Car honking...");
    }
}
