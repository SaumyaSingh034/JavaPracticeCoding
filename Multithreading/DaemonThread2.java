public class DaemonThread2 extends Thread
{
public void run()
{
try{
while(true)
{
//int a=5,b=0;
//int c= a/b;
System.out.println("Daemon is running");
}
}catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
System.out.println("Daemon Thread exiting"); //never call
}
}
public static void main(String[] args)
{
Thread t = new DaemonThread2();
System.out.println("Main Thread...");
t.setDaemon(true); // making this thread daemon
t.start();
}
}