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
super.display();// only parentclass
}
}
class ParentClassMethod
{
public static void main(String[] arr)
{
SubClass obj=new SubClass();
obj.print();
}
}