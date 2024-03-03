#include<iostream>
using namespace std;
class publicClass{
    int priv = 5;
    protected:
    int pro = 6;
    public:
    int pub = 7;
    int getprivate(){
        return priv;
    }
};
class pubsubclass : public publicClass{
    public:
    int varpro = pro;
    int varprivate = getprivate();
};
class privateClass{
    private:
    int priv2 = 8;
    protected:
    int pro2 = 9;
    public:
    int pub2 = 10;
    int getprivate2(){
        return priv2;
    }
};    

class privsubclass : privateClass{
    public:
    int varpro2 = pro2;
    int varprivate2 = getprivate2();
    int varpub2 = pub2;
};    

class protectedClass{
    private:
    int priv3 = 11;
    protected:
    int pro3 = 12;
    public:
    int pub3 = 13;
    int getprivate3(){
        return priv3;
    }
};    

class prosubclass : protected protectedClass{
    public:
    int varpro3 = pro3;
    int varprivate3 = getprivate3();
    int varpub3 = pub3;
};
int main(){
    pubsubclass obj1;
    cout<<"public variable : "<<obj1.pub<<endl;
    cout<<"private variable : "<<obj1.varprivate<<endl;
    cout<<"protected variable : "<<obj1.varpro<<endl;
    cout<<endl;
    privsubclass obj2;
    cout<<"public variable : "<<obj2.varpub2<<endl;
    cout<<"private variable : "<<obj2.varprivate2<<endl;
    cout<<"protected variable : "<<obj2.varpro2<<endl;
    cout<<endl;
    prosubclass obj3;
    cout<<"public variable : "<<obj3.varpub3<<endl;
    cout<<"private variable : "<<obj3.varprivate3<<endl;
    cout<<"protected variable : "<<obj3.varpro3<<endl;
    cout<<endl;
}
