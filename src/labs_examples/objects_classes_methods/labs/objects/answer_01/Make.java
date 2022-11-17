package labs_examples.objects_classes_methods.labs.objects.answer_01;

public class Make {
    private String make;

    public Make(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Make{" +
                "make='" + make + '\'' +
                '}';
    }
}
