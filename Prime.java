import java.util.Scanner;
class Prime
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int m = a/2;
int k=0;
for(int i=a;i<m;i++)
{
 if(a%2==0)
 System.out.println("no is not prime number");
 k=1;
 }
 if(k==0)
 System.out.println("no. is prime number");
 }
 }
 