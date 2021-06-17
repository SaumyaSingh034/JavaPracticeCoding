class ArrayInt
{
public static void main(String[] args)
{
 int[] source ={1,2,3,4,5,6,7,8};
 int[] desti = {56,67,89,22,45,12,23,46,78,88,99,90,57};
 System.arraycopy(source,3,desti,6,4);
 for(int i=0;i<desti.length;i++)
 {
  System.out.print(desti[i]+"\t");
 }
 }
 }