class Synchronize
{
}
class Threading extends Thread
{
Synchronied sd;
Threading(String name, Synchronized sd1)
{
super(name);
sd=sd1;
}
public void run()
{
synchronised(sd)
{
try
{
for(int i=0;i<=5;i++)
{
System.out.println(Thread.currentThread()+":"+i);
Thread.sleep(2000);
}
}catch(Exception e){}
}
}
}
class SynchBlockDemo
{
public static void main(String[] args)
{
Synchronized sd = new Synchronized();

Thread t1 = new Threading("Thread-1",sd);
t1.start();
Thread t2 = new Threading("Thread-1",sd);
t2.start();
}
}