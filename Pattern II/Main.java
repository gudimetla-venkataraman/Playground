#include<iostream>
using namespace std;
int main()
{
	int i,j,n,k=0;
	cin>>n;//input-height of the pattern
	for(i=1;i<=n;i++)
	{
		if(i%2!=0)
			k=k+i;
		else
			k=k+i-1;
		for(j=1;j<=2*i-1;j++)//loop for printing the pattern
		{
			if(j%2==0)
				cout<<"*";
			else
			{
				if(i%2==0)
					cout<<k--;
				else
					cout<<k++;
			}
		}
		cout<<endl;//move to next line after printing each row
	}
	return 0;
}