// parameterised
class This5
{
int id;
String name;
String city;
This5(int id,String name)
{
this.id=id;
this.name=name;
}
This5(int id,String name,String city)
{
this(id,name);
this.city=city;
}
void display()
{
System.out.println(id+ " " +name+ " " +city);
}
public static void main(String[] arr)
{
This5 k = new This5(1,"saumya","vns");
k.display();
This5 j = new This5(2,"sharal");
j.display();
}
}