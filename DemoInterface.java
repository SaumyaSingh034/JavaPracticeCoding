interface FunInterface
{
  default void display()
  {
    System.out.println("Hello,From Interface");
  }
  static void show()
  {
     System.out.println("Static function in interface");
  }
 }
 class Example implements FunInterface
 {
    public void display()
	{
	  System.out.println("Hello,From class");
	 }
	/* public static void show()
	 {
	 System.out.println("Static Function");
	 }*/
}
class DemoInterface
{

public static void main(String[] arr)
{
   FunInterface ex = new Example();
   ex.display();
   FunInterface.show();
   //Example.show();
   //ex.show(); error
   }
   }