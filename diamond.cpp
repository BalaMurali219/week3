#include<iostream>
using namespace std;
class Manager {
public:
    void displayManager() {
        cout << "I'm the manager, and two employees work under me. I'm not involved in the project." << endl;
    }
};

class MenEmployee : public virtual Manager {
public:
    void displayMaleEmployee() {
        cout << "I'm the male employee under the Manager, and I don't know about the female employee." << endl;
    }
};

class FemaleEmployee : public virtual Manager {
public:
    void displayFemaleEmployee() {
        cout << "I'm the female employee under the Manager, and I don't know about the male employee." << endl;
    }
};

class ProjectLove : public MenEmployee, public FemaleEmployee {
public:
    void displayProjectLove() {
        // Now, displayManager can be accessed without ambiguity
        displayManager();
        cout << "Manager is nowhere involved in the project." << endl;
        cout << "Female and Male employees are working on ProjectLove." <<endl;}
};
int main()
{
    ProjectLove obj;
    obj.displayManager();
    obj.displayMaleEmployee();
    obj.displayFemaleEmployee();
}
