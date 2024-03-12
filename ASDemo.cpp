#include <iostream>
using namespace std;

class ASDemo {
private:
    int priVar;
protected:
    int proVar;
public:
    int pubVar;
    void setVar(int priValue, int proValue, int pubValue) {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }
    void getVar() 
    {
        cout<<"Private Variable: "<<priVar<<endl;
        cout<<"Protected Variable: "<<proVar<<endl;
        cout<<"Public Variable: "<<pubVar <<endl;
    }
};

int main() {
    ASDemo obj;
    obj.setVar(10, 20, 30);
    obj.getVar();
    return 0;
}
