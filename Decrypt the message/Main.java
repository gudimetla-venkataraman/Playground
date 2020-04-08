#include<iostream>
int main()
{
int a,b,temp,perfect=0,i;
 std:: cin>>a;
 std:: cin>>b;
  a=a+b;
  temp=a;
for(i=1;i<=a/2;i++)
{
  if(a%i==0)
  {
    perfect=perfect+i;
  }
}
  if(perfect==temp)
  {
    std::cout<<"They can read the message";
  }
  else{
    std::cout<<"They can't read the message";
  }
}

