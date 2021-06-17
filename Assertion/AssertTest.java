import java.util.Scanner;
class AssertTest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number between 0 to 10");
int n = sc.nextInt();
assert(n>=0 && n<=10):"not valid"+n;
System.out.println("you entered"+n);
}
}