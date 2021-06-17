class A
{
A getA()
{
return(this);
}
void msg()
{
System.out.println("hello java");
}
}
class This6
{
public static void main(String[] arr)
{
new A().getA().msg();
//newA().msg();
}
}