interface Calculation
{
float Area(float r);
}
interface Rect
{
float Volume(float v);
}
class Circle implements Calculation,Rect
{
float ar;
float vol;
public float Area(float x)
{
float PI=3.14f;
ar = PI*x*x;
return ar;
}
public float Volume(float p)
{
float PI=3.14f;
vol = 2*PI*p;
return vol;
}
}
class Interface
{
public static void main(String[] arr)
{
Circle c = new Circle();
float k = c.Area(6.00f);
float g = c.Volume(4.45f);
System.out.println("area"+k);
System.out.println("volume"+g);
}
}