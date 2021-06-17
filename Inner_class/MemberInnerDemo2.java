// Example of member inner class that is invoked outside
class Outer
{
private int a=50;
class Inner
{
void msg()
{
System.out.println("Value of member is:"+a);
}
}
void disp()
{
System.out.println("Hello");
}
}
class MemberInnerDemo2
{
public static void main(String[] arr)
{
//Outer.Inner x = new Outer().new Inner();
//x.msg();
//x.disp();//error
Outer obj = new Outer();
obj.disp();
Outer.Inner y =obj.new Inner();
y.msg();
}
}
