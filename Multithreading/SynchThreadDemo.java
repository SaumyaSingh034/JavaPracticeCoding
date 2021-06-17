class Synchronized
{
public synchronized void display()
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread()+":"+i);
try
{
Thread.sleep(1000);
}catch(InterruptedException e){}
}
}
}
class Threading extends Thread
{
Synchronized sd;
Threading(String name, Synchronized sd1)
{
super(name);
sd=sd1;
}
public void run()
{
sd.display();
}
}
class SynchThreadDemo
{
public static void main(String args[])
{
Synchronized sd = new Synchronized();

Thread t1 = new Threading("Thread-1",sd);
t1.start();

Thread t2 = new Threading("Thread-2",sd);
t2.start();
}
}