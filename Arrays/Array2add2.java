import java.util.Scanner;
class Array2add2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows = ");
int r = sc.nextInt();
System.out.println("Enter number of cols= ");
int c = sc.nextInt();
int[][] x = new int[r][c];
int[][] y= new int[r][c];
int[][] sum= new int[r][c];
if(r==c)
{
System.out.println("Enter elemnts in array X");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   x[i][j] = sc.nextInt();
}   
System.out.println("Enter elemnts in array Y");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   y[i][j] = sc.nextInt();
}   
// addition
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   sum[i][j] = x[i][j]+y[i][j];
}   
System.out.println("elemnts in array are Z");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   System.out.print(" " +sum[i][j]);
   System.out.println(" ");
}
}
else
{
System.out.println("Check row and column and try again");
}   
}
}