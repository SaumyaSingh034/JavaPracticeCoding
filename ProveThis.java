//proving this keyword
class ProveThis
{
void m()
{
System.out.println(this); // prints same refernce
}
public static void main(String[] arr)
{
ProveThis obj = new ProveThis();
System.out.println(obj); // prints the refernce
obj.m();
}
}