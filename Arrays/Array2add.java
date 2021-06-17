import java.util.Scanner;
class Array2add
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int[][] x = new int[3][3];
int[][] y= new int[3][];
int[][] z= new int[3][3];
System.out.println("Enter elemnts in array X");
for(int i=0;i<x.length;i++)
{
  for(int j=0;j<x[i].length;j++)
   x[i][j] = sc.nextInt();
}   
System.out.println("Enter elemnts in array Y");
for(int i=0;i<y.length;i++)
{
  for(int j=0;j<y[i].length;j++)
   y[i][j] = sc.nextInt();
}   
// addition
for(int i=0;i<z.length;i++)
{
  for(int j=0;j<z[i].length;j++)
   z[i][j] = x[i][j]+y[i][j];
}   
System.out.println("elemnts in array are Z");
for(int i=0;i<z.length;i++)
{
  for(int j=0;j<z[i].length;j++)
   System.out.print(" " +z[i][j]);
   System.out.println(" ");
}   
}
}