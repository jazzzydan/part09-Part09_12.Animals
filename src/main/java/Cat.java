public class Cat extends Animal{


    // Parameterized constructor that allows setting a custom name
    public Cat(String name) {
        super(name); // Pass the provided name to the Animal constructor
    }

    // Non-parameterized constructor that sets the name to "Cat"
    public Cat() {
        this("Cat"); // Pass the default name "Cat" to the Animal constructor
    }

    public void purr() {
        System.out.println(getName() + " purrs");
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
        this.purr();
    }
}
