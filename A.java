import java.io.*;
import java.util.*;
public class A
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
Reverse r=new Reverse();
int b[]=r.reverseN(a,n);
for(int i=0;i<n;i++)
{
System.out.println(b[i]);
}
}
}
