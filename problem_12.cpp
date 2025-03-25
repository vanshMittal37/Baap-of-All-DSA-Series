// What will be the output of the following code
#include<iostream>
using namespace std;
int main(){
    int x = 4, y = 2, z;
    z = x++ * --y + ++x;
    cout<<x<<" "<<y<<" "<<z;
}
// The output is : 6 1 10