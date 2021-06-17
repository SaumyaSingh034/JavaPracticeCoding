class TestPriority1 extends Thread
{
public void run()
{
 for(int i=1;i<=5;i++)
 {
  System.out.println(Thread.currentThread()+":"+i);
  }
  }
  public static void main(String[] args)
  {
   TestPriority t1 = new TestPriority();
   t1.setPriority(Thread.MAX_PRIORITY);
   t1.start();
   
   TestPriority t2 = new TestPriority();
   t2.setPriority(Thread.MIN_PRIORITY);
   t2.start();
   
   TestPriority t3 = new TestPriority();
   t3.setPriority(Thread.NORM_PRIORITY);
   t3.start();
   }
   }
   
   