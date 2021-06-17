import java.util.Scanner;
class If
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number");
float a= sc.nextFloat();
float b= sc.nextFloat();
float c=a/b;
if(a<b)
System.out.println("put value of a larger than b");
else
System.out.println("division is"+c);
}
}