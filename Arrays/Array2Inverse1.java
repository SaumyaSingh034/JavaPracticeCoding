import java.util.Scanner;
class Array2Inverse1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int[][] a = new int[3][3];
System.out.println("Enter elemts in matrix");
for(int i=0;i<a.length;i++)
{
  for(int j=0;j<a[i].length;j++)
  a[i][j] = sc.nextInt();
}
System.out.println("Matrix is = ");
for(int i=0;i<a.length;i++)
{
  for(int j=0;j<a[i].length;j++)
  System.out.print(" "+a[i][j]);
  System.out.println(" ");
}
//reverse
System.out.println("Reverse matrix is = ");
for(int i=a.length-1;i>=0;i--)
{
 for(int j=a[i].length-1;j>=0;j--)
 System.out.print(" "+a[i][j]);
 System.out.println(" ");
}
}
}