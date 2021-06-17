class DaemonThread3 extends Thread
{
public DaemonThread3()
{
 setDaemon(true);
 }
 public void run()
 {
 System.out.println("Is this thread Daemon?--"+isDaemon());
 }
 public static void main(String args[])
 {
 DaemonThread3 dt = new DaemonThread3();
 System.out.println("Main Thread..");
 dt.start();
 }
 }