class Man
{
 public void show()
 {
  System.out.println("Man cannot fly");
 }
}
class SuperMan extends Man
{
 public void show()
 {
   System.out.println("Superman can fly");
  }
 }
 class SpiderMan extends Man
 {
 public void show()
 {
   System.out.println("Spiderman can jump");
  }
 }
 class HeterogeneousDemo
{
public static void main(String[] args)
{
 Man[] arr = new Man[3];
 arr[0] = new Man();
 arr[0].show();
 arr[1] = new SuperMan();
 arr[1].show();
 arr[2] = new SpiderMan();
 arr[2].show();
 }
 }