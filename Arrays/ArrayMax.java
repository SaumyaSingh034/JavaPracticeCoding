// largest number
class ArrayMax
{
public static void main(String[] arr)
{
int[] List3={40,60,80,99,7,8};
int max=List3[0];
for(int i=0;i<List3.length;i++)
{
 if(List3[i]>max)
 {
   max=List3[i];
 }
}
System.out.println("Maximun number is="+max);
}
}