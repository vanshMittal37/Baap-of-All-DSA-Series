// What will be the output of following code
#include<iostream>
using namespace std;
int main(){
    int a = 10;
    int b = 5;
    int c = a+=b -= 2;
    cout<<a<<" "<<b<<" "<<c;
    return 0;
}
// The output is : 13 3 13