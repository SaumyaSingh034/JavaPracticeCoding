class Largest
{
public static void main(String[] args)
{
int[] numbers=new int[]{36,76,89,90,10,67,65,32,9};
int largest=numbers[0];
int smallest=numbers[0];
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]>largest)
   largest=numbers[i];
else if(numbers[i]<smallest)
    smallest=numbers[i];
}
System.out.println("Largest number"+largest);
System.out.println("smallest number"+smallest);
}
}