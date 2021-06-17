import java.util.Scanner;
class Armstrong
{
public static void main(String[] arr) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any integer");
int a = sc.nextInt();
int c=0;
int k=a;
while(a>0)
{
int b = a%10;
a=a/10;
 c= c+(b*b*b);
}
if(k==c)
System.out.println("No. is armstrong "+c);
else
System.out.println("No. is not armstrong"+c);
}
}
