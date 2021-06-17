class Param2
{
int x,y;
protected Param2(int a,int b)
{
x=a;
y=b;
System.out.println(x+"  value of super= "+y);
}
}
class Param3 extends Param2
{
 Param3()
 {
   super(5,6);
 System.out.println(x+"  value of sub"+y);
 }
 public static void main(String[] arr)
 { 
 new Param3();
 }
 }