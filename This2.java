class This2
{
int id;
String name;
This2()
{
System.out.println("Default Constructor is invoked");
}
This2(int id, String name)
{
this();
this.id=id;
this.name=name;
//this();
}
void display()
{
System.out.println(id+ " " +name);
}
public static void main(String[] arr)
{
This2 f= new This2(1,"SAumya");
f.display();
}
}