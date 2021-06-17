class MemberInnerDemo1
{
private int a=50;
class Inner
{
void msg()
{
System.out.println("value of member is"+a);
}
}
void disp()
{
Inner in= new Inner();
in.msg();
}
public static void main(String[] arr)
{
MemberInnerDemo1 x= new MemberInnerDemo1();
x.disp();
}
}