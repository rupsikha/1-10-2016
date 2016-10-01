import java.io.*;
import java.util.*;
public class E
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
Rotate r=new Rotate();
int b[]=r.rotateLeft(a,n);
for(int i=0;i<n;i++)
{
System.out.println(b[i]);
}
}
}
