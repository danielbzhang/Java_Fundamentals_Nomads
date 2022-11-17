package labs_examples.objects_classes_methods.labs.objects.answer_01;

public class Airplane {

    public static void main(String[] args) {
        Color color = new Color("white");
        HorsePower horsePower = new HorsePower(2000.39);
        Make make = new Make("Boing");
        PassengerCapacity passengerCap = new PassengerCapacity(300);

        Airplane boing = new Airplane(100.50, "High", color, horsePower, make, passengerCap);

        System.out.println("This " + boing.color.getColor() +" " + boing.make.getMake() + " has a fuel cap of " + boing.fuelCapacity + " and a horsepower of " + boing.horsePower.getHorsePower() + " and passenger cap of " + boing.passengerCapacity.getPassengerCapacity() + " and its current fuel cap is " + boing.currentFuelLevel);
        boing.color.setColor("Blue");
        boing.horsePower.setHorsePower(2225.98);
        System.out.println("This " + boing.color.getColor() +" " + boing.make.getMake() + " has a fuel cap of " + boing.fuelCapacity + " and a horsepower of " + boing.horsePower.getHorsePower() +  " and passenger cap of " + boing.passengerCapacity.getPassengerCapacity() + " and its current fuel cap is " + boing.currentFuelLevel);
        System.out.println(boing.toString());
        System.out.println(boing.color.toString());
        System.out.println(boing.make.toString());
        System.out.println(boing.horsePower.toString());
        boing.horsePower.setHorsePower(1000000.29);
        System.out.println(boing.horsePower.toString());
    }

    private double fuelCapacity;
    private String currentFuelLevel;
    private Color color;
    private HorsePower horsePower;
    private Make make;
    private PassengerCapacity passengerCapacity;

    public Airplane(double fuelCapacity, String currentFuelLevel, Color color, HorsePower horsePower, Make make, PassengerCapacity passengerCapacity) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.color = color;
        this.horsePower = horsePower;
        this.make = make;
        this.passengerCapacity = passengerCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(String currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public HorsePower getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(HorsePower horsePower) {
        this.horsePower = horsePower;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(PassengerCapacity passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                ", color=" + color +
                ", horsePower=" + horsePower +
                ", make=" + make +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
