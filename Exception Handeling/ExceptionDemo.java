class ExceptionDemo
{
 public static void main(String args[])
 {
  int data =0;
  try{
    data = 20/0;
	//System.out.println(data);
	}catch(ArithmeticException e)
	{
	 System.out.println(e);
	 //e.printStackTrace();
	 //System.out.println(e.getMessage());
	 //System.out.println(data);
	 //System.out.println(e.printStackTrace()); //error
	 }
	 finally
	 {
	 System.out.println("Always executed");
	 }
	}
}