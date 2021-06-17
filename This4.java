//
class This4
{
void m(This4 obj)
{
System.out.println("method is invoked");
System.out.println(obj);
}
void p()
{
m(this);
}
public static void main(String[] arr)
{
This4 x= new This4();
x.p();
System.out.println(x);
}
}
