class Demo
{
void sum(int a, int b)
{
int c= a+b;
System.out.println("sum is"+c);
}
}
class Add1
{
public static void main(String[] arr)
{
Demo x;
x= new Demo();
x.sum(5,4);
x.sum(6,9);
x.sum(4,4);
}
}