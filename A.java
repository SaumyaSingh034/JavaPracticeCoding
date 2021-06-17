class A
{
A()
{
System.out.println("fist class");
}
A(int a)
{
int x=a;
System.out.println(x+ " ");
}

A(int a,int b)
{
int x=a;
int y=b;
System.out.println(x+ " " +y);
}
A(int a, float b)
{
int x=a;
float y=b;
System.out.println(x+ " " +y );
}
A(float a,int b)
{
float x=a;
int y=b;
System.out.println(x+ " " +y);
}
A(float a, float b)
{
 float x=a;
float y=b;
System.out.println(x+ " " +y);
}
public static void main(String[] arr)
{
new A();
new A(6);
new A(4,5);
new A(3,6.78f);
new A(5.89f,9);
new A(4.5f,6.78f);
}
}
