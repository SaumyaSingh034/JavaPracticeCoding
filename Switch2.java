import java.util.Scanner;
class Switch2
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter roll number");
String s = sc.next();
switch(s)
{
case "sam": System.out.println("Saumya singh");
               break;
case "harsh": System.out.println("harsha singh");
               break;
default : System.out.println("roll no not found");
           break;
}
}
}