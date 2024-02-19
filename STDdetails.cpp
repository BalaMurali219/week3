#include<iostream>
using namespace std;
class Student {
private:
    string fullName;
    int rollNum;
    double semPercentage;  
    string collegeName;
    int collegeCode;
public:
    // Constructor
    Student(string s, int roll, double semper, string college, int code) {
        fullName = s;
        rollNum = roll;
        semPercentage = semper; 
        collegeName = college;
        collegeCode = code;
    }
    // Destructor
    ~Student() {
    }
    void display() {
        cout << "Full Name: " << fullName << endl;
        cout << "Roll Number: " << rollNum << endl;
        cout << "Semester Percentage: " << semPercentage << endl;
        cout << "College Name: " << collegeName << endl;
        cout << "College Code: " << collegeCode << endl;
    }
};
int main() {
    Student student1 = Student("Murali", 527, 85, "MVGR", 33);
    student1.display();

    return 0;
}
