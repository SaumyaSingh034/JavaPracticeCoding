class A
{
public void display()
{
System.out.println("within method");
}
}
class B extends A
{
public void show()
{
System.out.println("this is show");
}
}
class Inherit
{
public static void main(String[] arr)
{
B obj= new B();
obj.display();
obj.show();
}
}