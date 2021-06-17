class StaticNestedDemo1
{
static int a=5;
void m()
{
System.out.println("Value of static member in outer class"+a);
}
static class Inner
{
void msg()
{
System.out.println("Value of inner class"+a);
}
}
public static void main(String[] arr)
{
StaticNestedDemo1.Inner obj = new StaticNestedDemo1.Inner();
obj.msg();
//obj.m(); //error
StaticNestedDemo1 x= new StaticNestedDemo1();
x.m();
}
}