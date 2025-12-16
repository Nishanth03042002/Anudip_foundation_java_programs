class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();

        Cat c = new Cat();
        c.makeSound();
    }
}
