class A
{
final float PI=3.14f;
float r,ar,pe;
public A(float ra)
{
r=ra;
}
}
class B extends A
{
public B(float arr)
{
super(arr);
}
void area()
{
ar=PI*r*r;
}
void peri()
{
pe=2*PI*r;
}
}
class C extends B
{
public C(float ra)
{
super(ra);
}
void show()
{
System.out.println("area"+ar);
System.out.println("perimeter"+pe);
}
}
class Multiinheritence
{
public static void main(String[] arr)
{
C obj= new C(2.1F);
obj.area();
obj.peri();
obj.show();
}
}