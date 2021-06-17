class Simple
{
}
class GetClassDemo
{
 void printName(Object obj)
 {
  Class c = obj.getClass();
  System.out.println(c.getName());
  }
  public static void main(String[] args)
  {
   Simple s = new Simple();
   GetClassDemo t = new GetClassDemo();
   t.printName(s);
   }
  }