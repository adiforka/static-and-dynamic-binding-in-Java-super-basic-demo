package static_vs_dynamic_binding;

public class Animal {

    void eat() {
        System.out.println("animal is eating...");
    }

    void eat(String text) {
        System.out.println("animal is eating..." + text);
    }
}
