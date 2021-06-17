class Rect
{
int len, bre;
Rect(int l,int b)
{
len=l;
bre=b;
}
void area()
{
int ar=len*bre;
System.out.println("area"+ar);
}
}
class RectDemo extends Rect
{
int hei;
 RectDemo(int l,int b,int h)
{
super(l,b);
hei=h;
}
void vol()
{
int v= len*bre*hei;
System.out.println("volume"+v);
}
}
class Single
{
public static void main(String[] arr)
{
RectDemo x = new RectDemo(4,5,6);
x.area();
x.vol();
}
}