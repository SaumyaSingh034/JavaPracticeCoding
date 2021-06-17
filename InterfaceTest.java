interface InterTest
{
final static int s=50;
// System.out.println(s);
abstract void sum();
void avg();
}
class A implements InterTest
{
//System.out.println(s); error
int a=10,b=20;
public void sum()
{
System.out.println(s);
System.out.println("sum is"+(a+b));
}
public void avg()
{
System.out.println(s);
System.out.println("average is"+(a+b)/2);
}
}
class B implements InterTest
{
int a=10,b=20,c=30;
public void sum()
{
System.out.println(s);
System.out.println("sum is"+(a+b));
}
public void avg()
{
System.out.println(s);
System.out.println("average is"+(a+b+c)/3);
}
}
class InterfaceTest
{
public static void main(String[] arr)
{
InterTest obj = new A();
obj.sum();
obj.avg();
System.out.println(obj.s);
InterTest obj1 = new B();
obj1.sum();
obj1.avg();
}
}
