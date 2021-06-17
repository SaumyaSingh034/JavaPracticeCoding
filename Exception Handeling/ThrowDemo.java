class ThrowDemo
{
static void validate(int age)
{
  if(age<10)
  throw new ArithmeticException("Age is less than 10");
  else
  System.out.println("\n welcome to vote");
  }
  public static void main(String args[])
  {
  validate(5);
  }
  }