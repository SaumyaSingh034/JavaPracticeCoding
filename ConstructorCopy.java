class ConstructorCopy
{
int id;
String name;
ConstructorCopy(int i,String n)
{
id=i;
name=n;
}
ConstructorCopy(ConstructorCopy s)
{
id = s.id;
name= s.name;
}
void display()
{
System.out.println(id+ " " +name);
}
public static void main(String[] arr)
{
ConstructorCopy s1 = new ConstructorCopy(1,"Saumya");
s1.display();
ConstructorCopy s2 = new ConstructorCopy(s1);
s2.display();
}
}