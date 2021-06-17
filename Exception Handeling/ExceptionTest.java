class ExceptionTest
{
public static void main(String[] args)
{
int a[] = new int[2];
System.out.println("out of try");
try
{
  System.out.println("Access invalid element :"+a[3]);
 }
 finally
 {
  System.out.println("finally is always executed..11");
  }
  }
  }