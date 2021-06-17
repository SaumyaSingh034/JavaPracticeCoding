abstract class D
{
static int a;
static void set()
{
a=9;
System.out.println("a"+a);
}
}
class AbstractStatic extends D
{
public void show()
{
System.out.println("Saumya Singh");
}
public static void main(String[] arr)
{
AbstractStatic v= new AbstractStatic();
set();
v.show();
}
}


