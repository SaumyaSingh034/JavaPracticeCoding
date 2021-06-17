import java.util.Scanner;
class IfElseIf
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number");
int a= sc.nextInt();
int b= sc.nextInt();
int c=a+b;
if(c%2==0)
System.out.println("even number");
else if(c<0)
System.out.println("negative number");
else
System.out.println("odd number");
}
}