import java.util.Scanner;
class Continue
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any integer  ");
int n = sc.nextInt();
for(int i=1;i<=10;i++)
{
 if(i%2==0)
 {
  continue;
 }
 System.out.println(" "+i);
}
}
}
