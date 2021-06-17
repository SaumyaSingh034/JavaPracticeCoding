import java.util.Arrays;
class ArrayCopy
{
public static void main(String[] arr)
{
int[] value = {0,10,20,30,40,50};
//copy elements 
int[] copy = Arrays.copyOf(value,3);
for(int a : copy)
{
System.out.println(a);
}
System.out.println();
int[] copy1 = Arrays.copyOf(value, 4);
for(int a : copy1)
{
System.out.println(a);
}
System.out.println();
}
}
