package labs_examples.objects_classes_methods.labs.objects.answer_03;

public class Pizza {

    private String dough;
    private String topping;
    private String crust;

    public Pizza(String dough, String topping, String crust) {
        this.dough = dough;
        this.topping = topping;
        this.crust = crust;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
}
