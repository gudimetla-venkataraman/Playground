#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>b;
  a=b%10;
  b=b/10;
  b=b/10;
  b=b/10;
  
  c=b%1000;
  d=a+c;
  cout<<d;
}