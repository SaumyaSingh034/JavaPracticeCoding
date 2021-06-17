abstract class Shape
{
abstract void draw();
void draw1()
{
System.out.println("Non Abstract Method....");
}
}
class Rectangle extends Shape
{
void draw()
{
 System.out.println("Drawing Rectangle...");
 super.draw1();
}
}
class Circle extends Shape
{
void draw()
{
System.out.println("Drawing Circle");
super.draw1();
}
}
class Abstract2
{
public static void main(String[] arr)
{
Shape s= new Circle();
s.draw();
Shape s1 = new Rectangle();
s1.draw();
//s.draw1();
/*
Circle c= new Circle();
c.draw();
c.draw1();

Rectangle r = new Rectangle();
r.draw();
r.draw1();
*/
}
}