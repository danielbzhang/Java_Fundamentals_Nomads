package labs_examples.objects_classes_methods.labs.oop.A_inheritance.answer_01;

public class Transport {
    private double speed;
    private int passengerCapacity;
    private double horsePower;

    public Transport(double speed, int passengerCapacity, double horsePower) {
        this.speed = speed;
        this.passengerCapacity = passengerCapacity;
        this.horsePower = horsePower;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }
}
