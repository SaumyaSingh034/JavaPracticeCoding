class ConstructorwithoutCopy
{
int id;
String name;
ConstructorwithoutCopy(int i, String n)
{
id =i;
name=n;
}
ConstructorwithoutCopy()
{
}
void display()
{
System.out.println(id+ " "+name);
}
public static void main(String[] arr)
{
ConstructorwithoutCopy s1 = new ConstructorwithoutCopy(1,"saumya");
s1.display();
ConstructorwithoutCopy s2 = new ConstructorwithoutCopy();
s2.id=s1.id;
s2.name=s1.name;
s2.display();
}
}
