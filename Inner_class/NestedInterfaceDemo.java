interface Inter1
{
public void test();
interface Inter2
{
public void msg();
}
}
class NestedInterfaceDemo implements Inter1.Inter2
{
public void msg()
{
System.out.println("Hello method of inner interface");
}
public void test()
{
System.out.println("hello method");
}
public static void main(String[] arr)
{
Inter1.Inter2 obj = new NestedInterfaceDemo();
obj.msg();
//obj.test();//error
NestedInterfaceDemo ob = new NestedInterfaceDemo();
ob.test();
ob.msg();
}
}