class Param
{
int x,y;
Param(int a,int b)
{
x=a;
y=b;
System.out.println(x+" "+y);
}
void Show()
{
System.out.println(x+" "+y);
}
public static void main(String[] arr)
{
new Param1(5,7).Show();
}
}