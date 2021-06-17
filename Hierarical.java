class A
{
final float PI=3.14f;
float r,ar,peri;
public A(float ra)
{
r=ra;
}
}
class B extends A
{
public B(float ar)
{
super(ar);
}
void area()
{
ar=PI*r*r;
System.out.println("area"+ar);
}
}
class C extends A
{
public C(float peri)
{
super(peri);
}
void perimeter()
{
peri=2*PI*r;
System.out.println("perimeter"+peri);
}
}

class Hierarical
{
public static void main(String[] arr)
{
B obj= new B(4.5f);
obj.area();
C obj1 = new C(5.5F);
obj1.perimeter();
}
}