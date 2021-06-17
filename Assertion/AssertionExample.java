import java.util.Scanner;
class AssertionExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age");
int age = sc.nextInt();
assert(age>=18):"not valid";
System.out.println("Welcome to vote");
}
}