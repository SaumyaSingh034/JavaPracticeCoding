class MultipleException
{
public static void main(String[] args)
{
try{
int c[] ={0,1,2,3};
c[4]=4;
//int a=5/0; //Exception can't handle
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index out of bound"+e);
int a =5/0;
}
catch(ArithmeticException e)
{
System.out.println("Divide by zero "+e);
}
}
}