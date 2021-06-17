class ParentClass
{
void display()
{
System.out.println("Parentclass method");
}
}
class SubClass extends ParentClass
{
void display()
{
System.out.println("childclass method");
}
void print()
{
display();
super.display();
}
}
class ParentClassMethod
{
public static void main(String[] arr)
{
Subclass obj=new Subclass();
obj.print();
}
}