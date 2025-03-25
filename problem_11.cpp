// What will be the output of the following code
#include<iostream>
using namespace std;
int main(){
    int a = 3 , b = 5, c;
    c = a++ + ++b;
    cout<<a<<" "<< b << " " << c;
}
// the output is: 4 6 9