class Param1
{
int a,b;
Param1(int a,int b)
{
this.a=a;
this.b=b;
System.out.println(a+" "+b);
}
void Show()
{
System.out.println(a+" "+b);
}
public static void main(String[] arr)
{
new Param1(9,7).Show();
}
}