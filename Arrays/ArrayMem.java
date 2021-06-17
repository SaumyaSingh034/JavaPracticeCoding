import java.util.Scanner;
class ArrayMem
{
public static void main(String[] arr)
{
Scanner sc= new Scanner(System.in);
int n=5;
int x[] = new int[n];
System.out.println("Enter elements");
for(int i=0;i<x.length;i++)
{
x[i]=sc.nextInt();
}
for(int i=0;i<x.length;i++)
{
System.out.print(" "+x[i]);
}
}
}