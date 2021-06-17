interface Cal
{
int Area(int l,int b);
}
interface Cal1
{
int Volume(int x);
}
class Rect implements Cal, Cal1
{
int a;
int b;
public int Area(int ln,int br)
{
a = ln*br;
return(a);
}
public int Area1(int k,int l)
{
v=2*
}
class Interface1
{
public static void main(String[] arr)
{
Rect obj = new Rect();
int k=obj.Area(4,5);
System.out.println("area"+k);
}
}
