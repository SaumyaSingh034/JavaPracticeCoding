final class A
{
int x,y;
int c= x+y;
System.out.println(c);
}
class B extends A
{
int y=2*(x+y);
System.out.println(y);
}
class C
{
public static void main(String[] arr)
{
B w = new B(4,5);
}
}