interface Inter
{
void msg();
}
class AnonymousDemo2
{
public static void main(String[] arr)
{
Inter x= new Inter()
{
public void msg()
{
System.out.println("Hello Anonymous from Interface class");
}
};
x.msg();
}
}