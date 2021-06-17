import java.util.Arrays;
class ArrayCopyRange
{
public static void main(String[] arr)
{
int[] value = {10,20,30,40,50};
//copy elements 
int[] copy = Arrays.copyOfRange(value,2,5);
for(int a : copy)
{
System.out.println(a);
}
/*
int[] copy1 = Arrays.copyOf(value, 4);
for(int a : copy1)
{
System.out.println(a);
}
*/
}
}
