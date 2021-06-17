class HomogeneousDemo
{
  void show()
  {
   System.out.println("Heloo...");
   }
   public static void main(String[] args)
   {
    HomogeneousDemo[] arr = new HomogeneousDemo[3];
	arr[0] = new HomogeneousDemo();
	arr[0].show();
	arr[1] = new HomogeneousDemo();
	arr[1].show();
	arr[2] = new HomogeneousDemo();
	arr[2].show();
	}
}