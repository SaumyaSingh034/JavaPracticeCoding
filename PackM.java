import pack1.Pack1s;
import pack1.Pack2s;
class PackM
{
public static void main(String[] arr)
{
Pack1s obj = new Pack1s();
Pack2s obj2 = new Pack2s();
int s = obj.div(10,5);
int f = obj2.mul(10,5);
System.out.println("division of number"+s);
System.out.println("multi"+f);
}
}