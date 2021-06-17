import pack.PackFirst;
import pack.subpack.PackFirst1;
import pack.subpack.subpack1.PackFirst2;
class PackMain
{
public static void main(String[] arr)
{
PackFirst obj =new PackFirst();
PackFirst1 obj1 =new PackFirst1();
PackFirst2 obj2 = new PackFirst2();

int s= obj.sum(5,9);
int m= obj.minus(8,3);
int p= obj1.sum(4,5);
int q= obj1.minus(9,3);
int k= obj2.minus(6,3);
System.out.println("sum is "+s);
System.out.println("minus is "+m);
System.out.println("sum is "+p);
System.out.println("minus is "+q);

System.out.println("minus is "+k);
}
}