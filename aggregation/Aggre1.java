class Operation
{
int square(int n)
{
return(n*n);
}
}
class Aggre1
{
Operation op;//aggregation
final double PI=3.14;
double area(int radius)
{
op= new Operation();
int rsquare=op.square(radius);
return(PI*rsquare);
}
public static void main(String[] arr)
{
Aggre1 h= new Aggre1();
double result = h.area(4);
System.out.println(result);
}
}