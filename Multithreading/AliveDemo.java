class AliveDemo extends Thread
{
 public static void main(String[] args)
 {
 AliveDemo t1 = new AliveDemo();
 t1.start();
 System.out.println(t1.isAlive());
 
 AliveDemo t2 = new AliveDemo();
 System.out.println(t2.isAlive());
 }
 }