abstract class Person
{
abstract void eat();
}
class AnonymousDemo1
{
public static void main(String[] arr)
{
Person p= new Person()
{
void eat()
{
System.out.println("Hello Anonymous from abstract class");
}
};
p.eat();
}
}