class MyException extends Exception
{
private int ex;
MyException(int a)
{
 ex =a;
 }
 public String toString()
 {
  return "MyException["+ex+"] is less than zero";
  }
 }
 class UserDefinedExcep
 {
 static void sum(int a, int b) throws MyException
 {
 if(a<0)
 {
  throw new MyException(a);
  }
  else
  {
  System.out.println("Sum is = "+(a+b));
  }
 }
 public static void main(String[] args)
 {
   try
   {
    sum(-10,10);
	}catch(MyException me)
	{
	System.out.println(me);
	}
	}
	}