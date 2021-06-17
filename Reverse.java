import java.util.Scanner;
class Reverse
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int sum=0;
while(a>0)
{
int b=a%10;
sum=sum*10+b;
a = a/10;
}
System.out.println("reverse is"+sum);
}
}
