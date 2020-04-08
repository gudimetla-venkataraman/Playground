#include<iostream>
using namespace std;
int main()
{
 int a;
    int b;
    int c;
  cin>>a;
  cin>>b;
  cin>>c;
    if(c>(a*1) && (c<=(a*2))){
        cout<<"It is a mango tree";
    }else if(c>(b*(b-2)) &&(c<=(b*(b-1)))){
       cout<<"It is a mango tree";
        }
        else{
            cout<<"It is not a mango tree";
   
        }
}