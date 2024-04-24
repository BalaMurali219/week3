 #include<iostream> 
 using namespace std; 
 template <typename Digit> Digit add(Digit num1,Digit num2) 
 { 
 return num1+num2; 
 } 
 template <typename TempData> 
 class Report 
 { 
 TempData value; 
 public: 
 Report(TempData num1) 
 { 
 value=num1; 
 } 
 void displayValue() 
 { 
 cout<<"The value is "<<value<<endl; 
 } 
 }; 
int main() 
 { 
 int intResult=add(27,38); 
 float floatResult=add(2.5,4.7); 
 cout<<"The sum of the values : "<<intResult<<endl; 
 cout<<"The sum of the values : "<<floatResult<<endl; 
 Report <int>obj(7); 
 Report <double>obj2(3.5678765); 
 obj.displayValue(); 
 obj2.displayValue(); 
 return 0; 
 } 
