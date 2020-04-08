#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
    cin>>a;
  cin>>b;
  cin>>c;
  cin>>d;
  e=a+c;
  f=b+d;
  if(f>=100)
  {
   g=f/100;
    i=f%100;
     h=e+g;
  cout<<h;
     cout<<"\n"<<i;
 
  }else{
    cout<<e;
     cout<<"\n"<<f;
  }
  
 
  
  
}