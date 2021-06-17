import java.util.Scanner;
class Break
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any integer to print multiplication table ");
int n = sc.nextInt();
System.out.println("Multiplication table is"+n);
for(int b=1;b<=10;b++)
{
int k=n*b;
System.out.println(n+ "*" +b+ "=" +k);
if(k==56)
{
break;
}
}
System.out.println("loop is over");
}
}