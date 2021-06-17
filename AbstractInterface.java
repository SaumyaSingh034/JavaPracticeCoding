interface A
{
void a();
void b();
void c();
void d();
}
abstract class B implements A
{
public void c()
{
System.out.println("I am C");
}
//public abstract void a(); // no error
//public abstract void b(); // no error
//abstract void d(); // error
}
class M extends B
{
public void a()
{
System.out.println("I am A");
}
public void b()
{
System.out.println("I am B");
}
public void d()
{
System.out.println("I am D");
}
}
class AbstractInterface
{
public static void main(String[] arr)
{
A x = new M();
x.a();
x.b();
x.c();
x.d();
}
}