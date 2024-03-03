#include<iostream>
using namespace std;
class Claculator{
    public:
    double a,b;
    void add(double a, double b)
    {
        cout<<"a+b: "<<a+b<<endl;
    }
    void sub(double a, double b)
    {
        cout<<"a-b: "<<a-b<<endl;
    }

};
class AdvCalculator:public Claculator{
    public:
    void mul(double a, double b)
    {
        cout<<"a*b: "<<a*b<<endl;
    }
    void div(double a, double b)
    {
        cout<<"a/b: "<<a/b<<endl;
    }

};
int main()
{
    AdvCalculator obj;
    cout<<"enter the operands: "<<endl;
    cin>>obj.a>>obj.b;
    obj.add(obj.a,obj.b);
    obj.sub(obj.a,obj.b);
    obj.mul(obj.a,obj.b);
    obj.div(obj.a,obj.b);

}
