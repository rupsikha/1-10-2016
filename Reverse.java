public class Reverse
{
public int[] reverseN(int a[],int n)
{
int b[]=new int[n];
int x=n-1;
for(int i=0;i<n;i++)
{
b[i]=a[x];
x--;
}
return b;
}
}
