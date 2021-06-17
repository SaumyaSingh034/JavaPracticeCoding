class Priv
{
private Priv()
{
System.out.println("Private");
}
public Priv(int a)
{
new Priv();
}
}
class Private
{
public static void main(String[] arr)
{
new Priv(7);
}
}

