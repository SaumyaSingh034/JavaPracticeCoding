class R
{
void display()
{
System.out.println("within method A");
}
}
class S extends R
{
// super.display(); //error

void display()
{
System.out.println("Within method B");
super.display(); // removes overriding
}
public static void main(String[] arr)
{
R obj = new S();// virtual method innvocation
obj.display();
}
}
