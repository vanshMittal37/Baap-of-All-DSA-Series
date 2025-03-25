//  Explain the difference between x++ and ++x in your own words.

/* In c++ , x++ (post_Increment) gives the original value before increment while ++x (pre_Increment) gives the value after the increment
*/

// • Take an integer as input and:
// • Print its value using post-increment (x++).
// • Print its value again using pre-increment (++x).
#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter an integer : ";
    cin>>n;
    int y = n++;
    int z = ++n;
    cout<<y<<" "<<z;
   
}