import java.io.*;
import java.util.*;
public class D
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=in.nextInt();
}
Contains r=new Contains();
boolean b=r.containsPi(a,n);
System.out.println(b);

}
}
