import java.util.Scanner;
class ArrayTest1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int[] ar;
ar = new int[5];
System.out.println("Enter elements");
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]);
}
}
}


