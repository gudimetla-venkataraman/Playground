#include<iostream>
using namespace std;
int main()
{
 int a=1,j=0,i,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
   /* ++j;
    if(j%2==0)
    {
      cout<<(a*a)-1<<" ";
      a++;
    }else if(i==1)
    {
      cout<<"0"<<" ";
    }else
    {
      cout<<(a*a)-2<<" ";
      a++;
    }
    */
    if(i%2==1){
	int p = (i*i)-1;
      cout<<p<<" ";
    }else if(i%2 == 0){
      int q = (i*i)-2;
      cout<<q<<" ";
    }
  }
      
}