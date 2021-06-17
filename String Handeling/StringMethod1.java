class StringMethod1
{
public static void main(String[] args)
{
 String s1 ="Today was good day";
 String s2 ="Today was bad day";
 
 if(s1.equals(s2))
 System.out.println("Yes, they are equal");
 else
 System.out.println("Not equal");
 char c = s1.charAt(3);
 System.out.println(" "+c);
 if(s1.startsWith("Today"))
 System.out.println("Yes string is starting with today");
 else
 System.out.println("No");
 if(s1.endsWith("day"))
 System.out.println("Yes string is ending with day");
 else
 System.out.println("No");
 String s = s1.substring(6);
 System.out.println(s);
 String st = s1.substring(6,11);
 System.out.println(st);
 }
 }
 
 
 