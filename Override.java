final class R
{
 void display()
{
System.out.println("within method A");
}
}
class S extends R
{
void display()
{
System.out.println("Within method B");
}
public static void main(String[] arr)
{
S obj = new S();
obj.display();
}
}
