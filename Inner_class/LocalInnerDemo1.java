class LocalInnerDemo1
{
private int a=5; // instance variable
void disp()
{
System.out.println(a);
class Local
{
// System.out.println(a); //error
void get()
{
System.out.println(a);
}
}
Local obj = new Local();
obj.get();
}
public static void main(String[] arr)
{
LocalInnerDemo1 obj= new LocalInnerDemo1();
obj.disp();
}
}