import java.util.Arrays;
class ArrayFill
{
public static void main(String[] arr)
{
int[] a = new int[10];
Arrays.fill(a,5);
for(int value : a)
{
System.out.print(value);
System.out.print(" ");
}
}
}