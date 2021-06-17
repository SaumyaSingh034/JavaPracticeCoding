class StringBuffer
{
public static void main(String[] args)
{
StringBuffer sb1 = new StringBuffer("Hello");
sb1.append("Java");
System.out.println(sb1);

StringBuffer sb2 = new StringBuffer("Hello");
sb2.insert("Java");
System.out.println(sb2);


StringBuffer sb3 = new StringBuffer("Hello");
sb3.delete(1,3);
System.out.println(sb3);


StringBuffer sb4 = new StringBuffer("Hello");
sb4.replace(1,3,"Java");
System.out.println(sb4);


StringBuffer sb5 = new StringBuffer("Hello");
sb5.reverse();
System.out.println(sb5);
}
}