#include<iostream>
using namespace std;

 void sum(int x, int y) {
        cout << "x+y: " << x + y << endl;
    }
 void sum(int x, int y, int z) {
        cout << "x+y+z: " << x + y + z << endl;
    }
int main() {
    sum(1,2,3);
    sum(1,2);
}
