#include <iostream>
using namespace std;
// Single Inheritance
class Shape {
public:
    void display() {
        cout << "This is a shape." << endl;
    }
};
class Circle : public Shape {
public:
    void displayCircle() {
        cout << "This is a circle." << endl;
    }
};
// Multiple Inheritance
class A {
public:
    void displayA() {
        cout << "Class A" << endl;
    }
};
class B {
public:
    void displayB() {
        cout << "Class B" << endl;
    }
};
class C : public A, public B {
public:
    void displayC() {
        cout << "Class C" << endl;
    }
};
// Multilevel Inheritance
class Animal {
public:
    void eat() {
        cout << "Animal is eating." << endl;
    }
};
class Dog : public Animal {
public:
    void bark() {
        cout << "Dog is barking." << endl;
    }
};
class GermanShepherd : public Dog {
public:
    void guard() {
        cout << "German Shepherd is guarding." << endl;
    }
};
// Hierarchical Inheritance
class Cat : public Animal {
public:
    void meow() {
        cout << "Cat is meowing." << endl;
    }
};
// Hybrid Inheritance
class Hybrid : public A, public Cat {
public:
    void displayHybrid() {
        cout << "This is a hybrid class." << endl;
    }
};

int main() {
    // Single Inheritance
    Circle circle;
    circle.display();
    circle.displayCircle();
    // Multiple Inheritance
    C obj;
    obj.displayA();
    obj.displayB();
    obj.displayC();
    // Multilevel Inheritance
    GermanShepherd dog;
    dog.eat();
    dog.bark();
    dog.guard();
    // Hierarchical Inheritance
    Dog dog1;
    dog1.eat();
    dog1.bark();
    
    Cat cat;
    cat.eat();
    cat.meow();
    // Hybrid Inheritance
    Hybrid hybrid;
    hybrid.displayA();
    hybrid.meow();
    hybrid.displayHybrid();
    return 0;
}
