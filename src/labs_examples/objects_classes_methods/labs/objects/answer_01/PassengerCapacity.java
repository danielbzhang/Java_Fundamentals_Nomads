package labs_examples.objects_classes_methods.labs.objects.answer_01;

public class PassengerCapacity {
    private int passengerCapacity;

    public PassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "PassengerCapacity{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }
}
