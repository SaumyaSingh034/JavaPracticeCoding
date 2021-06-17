abstract Shape
{
abstract int area();
}
class Rect extends Shape
{
int len,bre;
Rect(int l,int b)
{
len=l;
bre=b;
}
int Area()
{
int ar = len*bre;
return ar;
}
}
class Abstract1
{
public static void main(String[] arr)
{
Rect obj = new Rect();
int f = obj.Area(4,5);
System.out.println("Area"+f);
}
}