import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MatcherPattern
{
public static void main(String[] args)
{
String t ="It was the best of times";
Pattern p = Pattern.compile("the");
//System.out.println(p);
Matcher m = p.matcher(t);
//System.out.println(m);
//boolean b = m.find();
if(m.find())
System.out.println("match found");
else
System.out.println("not found");
}
}