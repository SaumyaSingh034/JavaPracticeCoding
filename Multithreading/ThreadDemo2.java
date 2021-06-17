class Threading extends Thread
{
  Threading(String name)
  {
    super(name);
	}
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
class ThreadDemo2
{
 public static void main(String[] args)
 {
   Thread t1 = new Threading("Thread-1");
   t1.start();
   
   Thread t2 = new Threading("Thread-2");
   t2.start();
  }
  }