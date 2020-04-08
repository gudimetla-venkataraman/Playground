#include<iostream>
using namespace std;
int main()
{
 int n,sum=0,sum1=0,a;
  cin>>n;
  while(n>0)
  {
    a=n%10;
    if(a%2==0)
    {
      sum=sum+a;
    }else
    {
      sum1=sum1+a;
    }
    n=n/10;
  }
  if(sum==sum1)
  {
    cout<<"Yes";
  }else
  {
    cout<<"No";
  }
}