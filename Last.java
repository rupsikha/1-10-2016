public class Last
{
public int[] makeLast(int a[],int n)
{
int x=2*n;
int b[]=new int[x];
for(int i=0;i<x-1;i++)
{
b[i]=0;
}
b[x-1]=a[n-1];
return b;
}
}
