class ArrayVarargs
{
static void sum(int...arr)
{
int s=0;
for(int i=0;i<arr.length;i++)
{
 s+=arr[i];
}
System.out.println("Sum is"+s);
}
public static void main(String[] args)
{
sum();
sum(10);
sum(10,20);
sum(10,20,30);
sum(10,20,30);
sum(1,2,3);
 sum(1,2,3,4,5,6,7,8,9);
 }
 }