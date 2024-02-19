#include<iostream>
#include"boxArea.h"
#include"boxVolume.h"
using namespace std;
int main()
{
    float l,b,h;
    cout<<"Enter len of box :";
    cin>>l;
    cout<<"Enter width of box :";
    cin>>b;
    cout<<"Enter height of box :";
    cin>>h;
    boxArea(l,b,h);
    boxVolume(l,b,h);
}
