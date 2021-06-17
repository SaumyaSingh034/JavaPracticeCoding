class ParentClass
{
ParentClass()
{
System.out.println("Constructor of superclass");
}
}
class Subclass extends ParentClass
{
Subclass()
{
//super();
System.out.println("Constructor of subclass");
}
void display()
{
System.out.println("hello");
}
}
class ParentClassConstructor
{
public static void main(String[] arr)
{
Subclass n=new Subclass();
n.display();
}
}