import java.util.Scanner;
class NestedIf
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number");
int a= sc.nextInt();
int b= sc.nextInt();
int c= a*b;
if(c>100)
{
  if(c%2==0)
  {
     System.out.println("even number");
   }
   else 
   
    System.out.println("odd number");
}
else
System.out.println("input number less than 100");
}
}