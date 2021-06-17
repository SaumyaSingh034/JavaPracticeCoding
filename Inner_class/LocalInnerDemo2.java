class LocalInnerDemo2
{
int a=10;
void disp()
{
final int b= 20;
//int b=5;
class Local
{
void msg()
{
//b=5; //error
System.out.println(a+ " " +b);
}
}
Local obj = new Local();
obj.msg();
}
public static void main(String[] arr)
{
LocalInnerDemo2 obj = new LocalInnerDemo2();
obj.disp();
}
}