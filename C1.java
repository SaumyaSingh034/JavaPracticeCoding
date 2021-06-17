abstract class AbsDemo
{
void display(int x)
{
 System.out.println("Abstract"+x);
}
}
class C1 extends AbsDemo
{
int f
C1(int f)
{
 this.f = f;
 System.out.println("CLASS C"+f);
}
public static void main(String[] args)
{
new C1(60);
}
}