class P
{
protected P()
{
System.out.println("default");
}
}
class  Q extends P
{
Q()
{
System.out.println("sub");
}
public static void main(String[] arr)
{
new Q();
}

}