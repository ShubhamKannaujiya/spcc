import java.io.*;
import java.util.*;
import java.lang.String;
public class optimization
{
public static void main(String args[]) throws IOException
{

DataInputStream in=new DataInputStream(System.in);
String s1,s2;
String code[]=new String[10];
System.out.println("Enter the string1:");
s1=in.readLine();
System.out.println("Enter the string2:");
s2=in.readLine();
if(s1.equals(s2))
{
System.out.println("entered string is duplicate");
s2=null;
}
else
System.out.println("enter string is correct");
System.out.println("enter the line of code");
int n=Integer.parseInt(in.readLine());
System.out.println("enter the code of program");
for(int i=0;i<=n;i++)
code[i]=in.readLine();
for(int i=0;i<n;i++)
{
char c[]=code[i].toCharArray();
char d[]=code[i+1].toCharArray();
if ((c[0]=='i')&&(c[1]=='n')&&(c[2]=='t'))
if(d[3]==c[4])
System.out.println("the line"+code[i+1]+"will not be executed since it's a dead code");
else
System.out.println("code is correct");
}}}
