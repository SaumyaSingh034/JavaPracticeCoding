import java.util.Arrays;
class ArrayMerge
{
public static void main(String[] args)
{
int[] a = {10,20,50,80,90};
int[] b = {60,70,45,678};
// merge
int[] merge = new int[a.length+b.length];
for(int i=0;i<a.length;i++)
merge[i]=a[i];
for(int i=0;i<b.length;i++)
merge[i+a.length]=b[i];
System.out.println(Arrays.toString(merge));
}
}
