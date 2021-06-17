class JoinDemo1 extends Thread
{
String name;
JoinDemo1(String name)
{
  super(name);
 }
 public void run()
 {
   for(int i=1;i<=5;i++)
   {
    System.out.println(Thread.currentThread()+":"+i);
	try{
	Thread.sleep(2000);
	}catch(Exception e){System.out.println(e);}
	}
	}
	public static void main(String[] args)
	{
	Thread t1 = new JoinDemo1("Thread-1");
	Thread t2 = new JoinDemo1("Thread-2");
	Thread t3 = new JoinDemo1("Thread-3");
	t1.start();
	try{
	t1.join();
	}catch(Exception e){System.out.println(e);}
	
	t2.start();
	try{
	t2.join();
	}catch(Exception e){System.out.println(e);}
	
	t3.start();
	}
	}