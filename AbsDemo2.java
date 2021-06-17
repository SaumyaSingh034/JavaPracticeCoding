abstract class AbsDemo
{
public AbsDemo(int x)
{
System.out.println("Default Abstract class"+x);
}
}
class AbsDemo2 extends AbsDemo
{
int f;
AbsDemo2(int p)
{
this.f =p;

System.out.println("Default constructor"+p);
}
public static void main(String[] arr)
{
new AbsDemo2(4);
}
}