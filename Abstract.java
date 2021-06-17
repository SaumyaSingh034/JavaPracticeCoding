abstract class Shape
{
final int c=50;
abstract int Area();
public void show()
{
System.out.println("Hello,From abstract");
}
}
class Rect extends Shape
{
int len;
int bre;
Rect(int x,int y)
{
len=x;
bre=y;
}
int Area()
{
int area;
area = len*bre;
System.out.println(c);
return area;
}
}
class Abstract
{
public static void main(String[] arr)
{
Rect obj = new Rect(5,7);
obj.show();
int f = obj.Area();
System.out.println("area is"+f);
}
}