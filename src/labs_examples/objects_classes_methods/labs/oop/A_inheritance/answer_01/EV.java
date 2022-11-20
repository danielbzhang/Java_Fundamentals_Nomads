package labs_examples.objects_classes_methods.labs.oop.A_inheritance.answer_01;

public class EV extends Car{
    private double chargingTime;

    public EV(double speed, int passengerCapacity, double horsePower, String make, String model, boolean isHybrid, String color, String year, double chargingTime) {
        super(speed, passengerCapacity, horsePower, make, model, isHybrid, color, year);
        this.chargingTime = chargingTime;
    }

    @Override
    public void honk() {
        System.out.println("Electric vehicle honking...");
    }
}
