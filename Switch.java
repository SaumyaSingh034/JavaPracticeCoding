import java.util.Scanner;
class Switch
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter roll number");
int rn = sc.nextInt();
switch(rn)
{
case 1: System.out.println("Saumya singh");
               break;
case 2: System.out.println("harsha singh");
               break;
default : System.out.println("roll no not found");
           break;
}
}
}