#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a;
  int sum=0;
  int c=0;
  do{
    if(sum>=n)
    {
      cout<<"ok";
    }else{
  		cin>>a;
      sum += a;
      c++;
    }
  }while(sum<n);
    cout<<"The number of turns is "<<c;
}