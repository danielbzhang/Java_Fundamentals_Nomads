package labs_examples.objects_classes_methods.labs.objects.answer_03;

public class Controller {
    public static void main(String[] args) {
        Pasta mac = new Pasta("Tomato", "sour", "petuccini");
        Pizza papa = new Pizza("sour and soft", "three cheese", "thin");

        System.out.println("I love " + mac.getSauce() + " " +mac.getKind() +" and " + papa.getCrust() + " crust with " + papa.getTopping() + " pizza.");
    }
}
