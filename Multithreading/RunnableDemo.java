class RunnableThread implements Runnable
{
  public void run()
  {
     for(int i=1;i<=5;i++)
	 {
	    System.out.println(Thread.currentThread()+":"+i);
		try
		{
		  Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
	  }
	}
}
class RunnableDemo
{
public static void main(String args[])
{
  RunnableThread rt = new RunnableThread();
  Thread t1 = new RunnableThread();
  Thread t1 = new Thread(rt);
  t1.start();
  //RunnableThread rt1 = new RunnableThread();
  Thread t2 = new Thread(rt);
  t2.start();
  }
 }