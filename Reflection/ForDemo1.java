 class Simple
{
void show()
{
 System.out.println("Hello java ...");
 }
}
class ForDemo1
{
public static void main(String[] args)
{
try{
Class c = Class.forName("Simple");
//System.out.println(c);
//System.out.println(c.getName());
Simple s =(Simple)c.newinstance();
s.show();
}catch(Exception e){System.out.println(e);}
}
}