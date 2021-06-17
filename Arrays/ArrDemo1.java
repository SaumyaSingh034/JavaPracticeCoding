class Test
{
public void disp(int[] ad)
{
 for(int i=0;i<ad.length;i++)
 {
  System.out.println(ad[i]);
  }
 }
 }
 class ArrDemo1
 {
 public static void main(String[] args)
 {
  Test obj = new Test();
  //obj.disp(new int[5]); // output 5 zero
   int arr[] ={1,2,3,4,5};
   obj.disp(arr);
  }
 }