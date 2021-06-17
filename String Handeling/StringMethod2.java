import java.io.PrintWriter;
class StringMethod2
{
public static void main(String[] args)
{
PrintWriter pw = new PrintWriter(System.out,true);
String s1 ="It was great time with you";
String s2 ="It was great time with you";
if(s1.equals(s2))
pw.println("String Matched");
if(s1.contains("It was great"))
pw.println("found");
else
pw.println("not found");
String temp = s2.replace("w","zzz");
pw.println(temp);
}
}