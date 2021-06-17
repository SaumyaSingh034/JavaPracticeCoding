class ThrowDemo1
{
static void avg()
{
  try
    {
	   int a=5,b=0;
	   int c= a/b;
	   throw new ArithmeticException();
	}
	catch(ArithmeticException e)
	{
	 System.out.println("Exception caught");
	 System.out.println(e);
	}
	}
	public static void main(String[] args)
	{
	avg();
	}
	}