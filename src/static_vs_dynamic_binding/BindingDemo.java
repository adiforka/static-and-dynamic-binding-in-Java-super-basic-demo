package static_vs_dynamic_binding;

//for demo purposes we have a type and subtype that overrides both its methods, and within both type and subtype
//we have essentially a single overloaded method (no-arg vs 1 arg)
public class BindingDemo {
    public static void main(String[] args) {

        //based on the (nominal type -- that of the variable), the compiler expects
        //the call signature to match a signature of a method in the class of that type

        //if a class of that signature does not have a match --> compile-time error

        //at runtime the type will be instantiated by the JVM with the right implementation
        //as the constructor of that impl is called

        //then the right implementation of the eat method will be called depending on the actual type
        //of the object instantiated
        Animal a1 = new Animal();
        a1.eat();
        a1.eat("Crackers");

        Animal a = new Dog();
        a.eat();
        a.eat("Carrots");
    }
}
