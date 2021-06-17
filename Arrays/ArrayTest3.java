import java.util.Scanner;
class ArrayTest3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x[]=new int[5];
System.out.println("Enter Elements");
for(int i=0;i<x.length;i++)
{
 x[i]= sc.nextInt();
}
for(int i=0;i<x.length;i++)
{
System.out.print(" "+x[i]);
}
}
}