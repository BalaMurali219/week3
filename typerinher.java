class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    public void displayCircle() {
        System.out.println("This is a circle.");
    }
}

class A {
    public void displayA() {
        System.out.println("Class A");
    }
}

class B {
    public void displayB() {
        System.out.println("Class B");
    }
}

class C extends A {
    public void displayC() {
        System.out.println("Class C");
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class GermanShepherd extends Dog {
    public void guard() {
        System.out.println("German Shepherd is guarding.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

class Hybrid extends A {
    public void displayHybrid() {
        System.out.println("This is a hybrid class.");
    }
}

public class typeinher {
    public static void main(String[] args) {
        // Single Inheritance
        Circle circle = new Circle();
        circle.display();
        circle.displayCircle();

        // Multiple Inheritance
        C obj = new C();
        obj.displayA();
        obj.displayC();

        // Multilevel Inheritance
        GermanShepherd dog = new GermanShepherd();
        dog.eat();
        dog.bark();
        dog.guard();

        // Hierarchical Inheritance
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();
        
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        // Hybrid Inheritance
        Hybrid hybrid = new Hybrid();
        hybrid.displayA();
        hybrid.displayHybrid();
    }
}
