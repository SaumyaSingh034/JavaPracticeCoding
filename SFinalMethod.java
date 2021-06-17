 class R
{
final void display()
{
System.out.println("within method A");
}
}
class SFinalMethod extends R
{
void display()
{
System.out.println("Within method B");
}
public static void main(String[] arr)
{
SFinalMethod obj = new SFinalMethod();
obj.display();
}
}
