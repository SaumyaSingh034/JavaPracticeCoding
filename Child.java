class Parent
{
int num=100;
}
class Child extends Parent
{
int num=11;
void print()
{
System.out.println(super.num);
}
public static void main(String[] arr)
{
Child obj = new Child();
obj.print();
}
}