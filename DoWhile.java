import java.util.Scanner;
class DoWhile
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any value of n");
int n = sc.nextInt();

do
{
System.out.println("value of n="+n);
n++;
}while(n<20);
}
}