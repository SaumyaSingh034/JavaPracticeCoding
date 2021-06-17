// example of primitive to Wrapper
class WrapperDemo1
{
public static void main(String[] arr)
{
int a=5;
Integer i= Integer.valueOf(a); //converting into primitive
Integer j=a; //autoboxing
System.out.println(a+" "+i+" "+j);
}
}