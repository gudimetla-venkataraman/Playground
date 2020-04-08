#include<iostream>
using namespace std;
int main()
{
  int a,temp,sum=0,c;
    cin>>a;
  temp=a;
  while(a>0)
  {
    c=a%10;
    sum=sum+c;
    a=a/10;
  }
  if(temp%sum==0)
  {
    cout<<"Harshad Number";
  }
  else{
    cout<<"Not Harshad Number";
  }
    
}