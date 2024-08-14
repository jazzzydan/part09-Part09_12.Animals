public class Dog extends Animal {


    // Non-parameterized constructor that sets the name to "Dog"
    public Dog() {
        super("Dog"); // Pass the default name "Dog" to the Animal constructor
    }

    // Parameterized constructor that allows setting a custom name
    public Dog(String name) {
        super(name); // Pass the provided name to the Animal constructor
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

//    eat() and sleep() are inherited from abstract class

//    @Override
//    public void eat() {
//        super.eat();
//    }

//    @Override
//    public void sleep() {
//        super.sleep();
//    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}
