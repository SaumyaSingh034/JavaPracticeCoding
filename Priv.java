class Priv
{
int x,y;
private Priv(int a)
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

