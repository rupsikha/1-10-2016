import java.io.*;
import java.util.*;
public class C
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
Last r=new Last();
int b[]=r.makeLast(a,n);
int x=2*n;
for(int i=0;i<x;i++)
{
System.out.println(b[i]);
}
}
}
