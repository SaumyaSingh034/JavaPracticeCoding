import java.util.Scanner;
class Fibo
{
public static void main(String[] arr)
{
Scanner sc = new Scanner(System.in);
int febcount = sc.nextInt();
int[] feb = new int[febcount];
feb[0]=0;
feb[1]=1;
for(int i=2;i<febcount;i++)
feb[ i] =  feb[i-1]+feb[i-2];
for(int i=0;i<febcount;i++)
System.out.println("Fibonacci of numbers are= "+feb[i]);
}
} 