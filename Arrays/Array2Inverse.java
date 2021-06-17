import java.util.Scanner;
class Array2Inverse
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int[] a = new int[3];
System.out.println("Enter elemts in matrix");
for(int i=0;i<a.length;i++)
{
  a[i] = sc.nextInt();
}
//reverse
System.out.println("Reverse matrix is = ");
for(int i=a.length-1;i>=0;i--)
{
 System.out.println(" "+a[i]);
}

}
}