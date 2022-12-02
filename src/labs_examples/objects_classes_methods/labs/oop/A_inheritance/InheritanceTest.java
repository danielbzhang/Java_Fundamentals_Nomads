package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Parent c = new Child();
//            c.doSomething();
    }
}

class Parent {
    //        public void doSomething()
//        {
//            System.err.println("Parent called");
//        }
    public Parent() {
        System.err.println("Parent called");
    }
}

class Child extends Parent {
    //        @Override
//        public void doSomething()
//        {
//            System.err.println("Child called");
//        }
    public Child() {
        System.err.println("Child called");
    }
}

