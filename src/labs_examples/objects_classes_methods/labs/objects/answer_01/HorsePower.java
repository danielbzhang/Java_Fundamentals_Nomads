package labs_examples.objects_classes_methods.labs.objects.answer_01;

public class HorsePower {
   private double horsePower;

    public HorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "HorsePower{" +
                "horsePower=" + horsePower +
                '}';
    }
}
