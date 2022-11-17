package labs_examples.objects_classes_methods.labs.objects.answer_03;

public class Pasta {

    private String sauce;
    private String kind;

    public Pasta(String sauce, String dough, String kind) {
        this.sauce = sauce;
        this.kind = kind;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
