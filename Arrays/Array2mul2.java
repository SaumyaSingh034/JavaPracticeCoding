import java.util.Scanner;
class Array2mul2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows");
int r = sc.nextInt();
System.out.println("Enter number of columns in first matrix");
int c= sc.nextInt();
System.out.println("Enter no. of cols in second matrix");
int c1 = sc.nextInt();
int[][] x = new int[r][c];
int[][] y= new int[c][c1];
int[][] product= new int[r][c1];
if(r==c1)
{
System.out.println("Enter elemnts in array X");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   x[i][j] = sc.nextInt();
}   
System.out.println("Enter elemnts in array Y");
for(int i=0;i<c;i++)
{
  for(int j=0;j<c1;j++)
   y[i][j] = sc.nextInt();
} 
System.out.println(" elemnts in array X");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   System.out.print(" "+x[i][j]);
   System.out.println(" ");
}     
System.out.println("elemnts in array Y");
for(int i=0;i<c;i++)
{
  for(int j=0;j<c1;j++)
   System.out.print(" "+y[i][j]);
   System.out.println(" ");
}   
// multiplication
for(int i=0;i<r;i++)
{
  for(int j=0;j<c1;j++)
  {
   for(int k=0;k<c;k++)
   product[i][j]+= x[i][k]*y[k][j];
}   
}
System.out.println("elemnts in array are Z");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c1;j++)
   System.out.print(" " +product[i][j]);
   System.out.println(" ");
}
}
else
{
System.out.println("Check rows and cols and try again");
}   
}
}