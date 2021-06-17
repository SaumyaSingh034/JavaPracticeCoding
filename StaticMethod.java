class StaticMethod
{
static int a;
int b;
static void set()
{
a=10;
//b=23;
System.out.println("a"+a);
}
void get()
{
a=9;
b=10;
System.out.println(a+" "+b);
}
public static void main(String[] arr)
{
StaticMethod x = new StaticMethod();
x.get();
x.set();
set();
StaticMethod.set();
}
}