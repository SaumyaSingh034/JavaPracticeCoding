class CompareBothString
{
public static void main(String[] args)
{
 String s= "Hello";
 s.concat("Hii");
 System.out.println(s);
 StringBuffer sB = new StringBuffer("Hello");
 sB.append(" hii");
 System.out.println(sB);
 }
 }