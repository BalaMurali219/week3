#include <iostream>
using namespace std;

class Parent {
public:
    void displayMessage() {
        cout << "I'm parent" << endl;
    }
};

class Child : public Parent {
public:
    void displayMessage() {
        cout << "I'm Child" << endl;
    }
};

int main() {
    Child obj;
    obj.displayMessage();
    return 0;
}
