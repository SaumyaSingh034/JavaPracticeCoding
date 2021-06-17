import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReplacingExample
{
public static void main(String[] args)
{
String header = "<h1>This is an H1</h1>";
Pattern p1 = Pattern.compile("h1");
Matcher m1 = p1.matcher(header);
if(m1.find())
{
header = m1.replaceAll("p");
System.out.println(header);
}
}
}