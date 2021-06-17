class Threading extends Thread
{
  public void run()
  {
     for(int i=1;i<=5;i++)
	 {
	    System.out.println(i);
		try
		{
		  Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
	  }
	 }
}
class ThreadDemo1
{
  public static void main(String[] args)
  {
   Thread t1 = new Threading();
   t1.start();
   Thread t2 = new Threading();
   t2.start();
   }
 }