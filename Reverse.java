import java.io.*;
class Reverse
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int number,rem=0,rev=0;
number=Integer.parseInt(in.readLine());
while(number>0)
{
rem=number%10;
rev=(rev*10)+rem;
number=number/10;
}
System.out.println(rev);
}
catch(Exception e)
{
}
}
}
