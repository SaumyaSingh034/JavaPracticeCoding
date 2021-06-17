class Simple
{
}
class DotClass
{
   public static void main(String[] args)
   {
    Class c1 = boolean.class;
	System.out.println(c1.getName());
	
	Class c2 = DotClass.class;
	System.out.println(c2.getName());
	
	Class c3 = Simpe.class;
	System.out.println(c3.getName());
	}
	}