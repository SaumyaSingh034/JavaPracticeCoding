class Cons
{
int id;
String name;
Cons(int id, String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println("id"+id);
System.out.println("name"+name);
}
public static void main(String[] arr)
{
Cons d= new Cons(29,"Saumya");
d.display();
}
}