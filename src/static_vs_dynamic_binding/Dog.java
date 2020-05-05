package static_vs_dynamic_binding;

public class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("dog is eating...");
    }

    @Override
    void eat(String text) {
        System.out.println("dog is eating..." + text);
    }
}
