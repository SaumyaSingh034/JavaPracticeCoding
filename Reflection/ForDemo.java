class Simple
{

}
class ForDemo
{
public static void main(String[] args)
{
try{
Class c = Class.forName("Simple");
//System.out.println(c);
System.out.println(c.getName());
}catch(Exception e)
{
System.out.println(e);
}
}
}