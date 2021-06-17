class RunnableThread implements Runnable
{
 RunnableThread(String threadName)
 {
  Thread t1 = new Thread(this, threadName);
  t1.start();
  }
  public void run()
  {
     for(int i=1;i<=5;i++)
	 {
	    System.out.println(Thread.currentThread()+":"+i);
		try
		{
		  Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
	  }
	}
}
class RunnableDemo2
{
 public static void main(String[] args)
 {
  new RunnableThread("Thread-1");
  new RunnableThread("Thread-2");
  new RunnableThread("Thread-3");
  }
 }