package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.answer_01;

public class Sedan extends Vehicle{
    protected String color;

    public Sedan(String make, String model, double miles, String color) {
        super(make, model, miles);
        this.color = color;
    }

    @Override
    public boolean start() {
        System.out.println("starting sedan");
        return true;
    }

    public boolean start(int mph) {
        System.out.println("starting at " + mph + " mph");
        return true;
    }

    @Override
    public void accelerate(double mph) {
        System.out.println("sedan accelerating");
    }
}
