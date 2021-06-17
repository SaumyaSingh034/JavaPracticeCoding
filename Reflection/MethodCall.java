import java.lang.reflect.Method;
class Demo
{
  private void msg()
  {
   System.out.println("Hello");
  }
   protected void msg()
   {
   System.out.println("Hello java");
   }
}
   class MethodCall
   {
   public static void main(String[] args) throws Exception
   {
   Class c = Class.forName("Demo");
Object o = c.newInstance();

Method m= c.getDeclareMethod("msg");
m.setAccessible(true);
m.invoke(o);

Method m1= c.getDeclareMethod("msg1");
m1.setAccessible(true);
m1.invoke(o);
}
}
   