// Animal class
class Animal {
    String name;
    
    // Constructor
    Animal(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println(name + " is eating");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    String breed;
    
    // Constructor
    Dog(String name, String breed) {
        super(name);  // Call parent constructor
        this.breed = breed;
    }
    
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Usage
public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.eat();   // Inherited method
        dog.bark();  // Dog's own method
    }
}