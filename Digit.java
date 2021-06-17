import java.util.Scanner;
class Digit
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int sum=0;
int k;
while(n>0)
{
k=n%10;
sum=sum+k;
n=n/10;
}
System.out.println("value of sum"+sum);
if(sum%2==0)
System.out.println("even");
else
System.out.println("Odd");
}
}