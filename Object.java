class Object
{
int a,b;
void set(int x,int y)
{
a=x;
b=y;
}
void show()
{
System.out.println(a+ " " +b);
}
public static void main(String[] arr)
{
Object obj1= new Object();
obj1.show();
obj1.set(5,7);
obj1.show();
Object obj2= new Object();
obj2.show();
obj2.set(7,9);
obj2.show();
Object obj3= new Object();

obj3 = obj2;
obj3.show();
}
}