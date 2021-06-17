class P
{
int r=90;
 final void display()
{
System.out.println("within method A");
System.out.println(r);
}
}
class SFinalVariable extends P
{
void display()
{
final int r=7;
System.out.println("Within method B");
System.out.println(r);
}
public static void main(String[] arr)
{
SFinalVariable obj = new SFinalVariable();
obj.display();
}
}
