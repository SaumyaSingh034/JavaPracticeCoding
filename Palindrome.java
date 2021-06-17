import java.util.Scanner;
class Palindrome
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt;
int sum=0;
int k;
int b=n;
while(n>0)
{
k=n%10;
sum=sum*10+k;
n=n/10;
}
if(sum==b)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}