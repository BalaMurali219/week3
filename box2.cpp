#include<iostream>
using namespace std;
class Box;
inline void displayWelcomeMessage(string s)
{
    cout<<"hello  "<<s<<"!"<<endl;
}
class Box{
    public:
    float length,width,height;
    void boxArea(float length, float width,float height)
    {
        cout << "The area of the box is: " << 2 * (length * width + width * height + height * length) << endl;

    }
    void boxVolume(float length, float width, float height);
    friend void displayBoxDimensions(Box b1);
};
void Box::boxVolume(float length,float width,float height)
{
    cout<<"the volume of the box is: "<<length*width*height<<endl;
}
void displayBoxDimensions(Box b1)
{
    cout<<"length: "<<b1.length<<" width: "<<b1.width<<" volume: "<<b1.height<<endl;
}
int main()
{
    Box b1;
    cout<<"enter the length, width,height of the box: ";
    cin>>b1.length>>b1.width>>b1.height;
    b1.boxArea(b1.length,b1.width,b1.height);
    b1.boxVolume(b1.length,b1.width,b1.height);
    displayBoxDimensions(b1);
    string s;
    cout<<"enter your name: ";
    cin>>s;
    displayWelcomeMessage(s);   
}
