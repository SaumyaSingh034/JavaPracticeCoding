public class DaemonThread1 extends Thread
{
 public void run()
 {
  if(Thread.currentThread().isDaemon())
  {
   System.out.println("Daemon thread...");
   }
   else
   {
   System.out.println("User Thread");
   }
   }
   public static void main(String[] args)
   {
    DaemonThread1 t1 = new DaemonThread1();
	DaemonThread1 t2 = new DaemonThread1();
	DaemonThread1 t3 = new DaemonThread1();
	 t1.setDaemon(true); //now t1 is daemon thread
	 t1.start();
	 t2.start();
	 t3.start();
	 }
	 }
	 