class StaticNestedDemo2
{
static int a=5;
static class Inner
{
static void msg()
{
System.out.println("Value of static member is"+a);
}
}
public static void main(String[] arr)
{
StaticNestedDemo2.Inner.msg();
Inner.msg();
//msg();//error
}
}