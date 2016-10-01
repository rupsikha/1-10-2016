public class Contains
{
public boolean containsPi(int a[],int n)
{
	boolean b=false;
for(int i=0;i<n-2;i++)
{
if(a[i]==3)
{
	if(a[i+1]==1)
	{
		if(a[i+2]==4)
		{
			b=true;
		}
	}
}
}
return b;
}
}



