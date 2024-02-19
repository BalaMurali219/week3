#include<iostream>
using namespace std;
class Student {
private:
    string fullName;
    double semPercentage;  
    string collegeName;
    int collegeCode;
public:
    // Constructor
    Student() {
        collegeName = "MVGR";
        collegeCode = 33;
    }
    Student(string name, double semper) {
        fullName = name;
        semPercentage=semper;
       collegeName = "MVGR";
        collegeCode = 33;
    }
    // Destructor
    ~Student() {       
    }
    void display() {
        cout << "Full Name: " << fullName << endl;
        cout << "Semester Percentage: " << semPercentage << endl;
        cout << "College Name: " << collegeName << endl;
        cout << "College Code: " << collegeCode << endl;
    }
};
int main() {
    Student student1 = Student("Murali",85);
    student1.display();
    return 0;
}
