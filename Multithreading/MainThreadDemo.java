class SubThread extends Thread
{
   SubThread()
   {
    super("SubThread");
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
class MainThreadDemo
{
  public static void main(String[] args)
  {
   Thread st = new SubThread();
   Thread mt = Thread.currentThread();
   System.out.println("Current thread: "+ mt);
   mt.setName("Main Thread");
   st.start();
   System.out.println("After name changes : "+mt);
     try
		{
		for(int i=1;i<=5;i++)
	     {
	    System.out.println(Thread.currentThread()+":"+i);
		  Thread.sleep(2000);
		}
		}
		catch(InterruptedException e) 
		{
		 System.out.println("Main Thread Interrupted");
		 }
	  }
	}

  