abstract class AbsDemo
{
public AbsDemo()
{
System.out.println("Default Abstract class");
}
}
class AbsDemo1 extends AbsDemo
{
AbsDemo1()
{
System.out.println("Default constructor");
}
public static void main(String[] arr)
{
new AbsDemo1();
}
}