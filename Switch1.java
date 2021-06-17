import java.util.Scanner;
class Switch1
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter roll number");
String s = sc.next();
char c = s.charAt(0);
switch(c)
{
case 'a': System.out.println("Saumya singh");
               break;
case 'b': System.out.println("harsha singh");
               break;
default : System.out.println("roll no not found");
           break;
}
}
}