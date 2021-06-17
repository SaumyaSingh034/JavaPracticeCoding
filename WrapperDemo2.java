// Example of primitive to Wrapper
class WrapperDemo2
{
public static void main(String[] arr )
{
Integer a= new Integer(5);
int i=a.intValue(); // converting Integer to int
int j=a; // unboxing
System.out.println(a+ " " +i+ " " +j);
}
}