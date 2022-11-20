package labs_examples.objects_classes_methods.labs.oop.A_inheritance.answer_01;

public class Plane extends Transport{
    private String manufacturer;

    public Plane(double speed, int passengerCapacity, double horsePower, String manufacturer) {
        super(speed, passengerCapacity, horsePower);
        this.manufacturer = manufacturer;
    }

    public void fly() {
        System.out.println("Plane flying...");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
