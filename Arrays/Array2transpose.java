import java.util.Scanner;
class Array2transpose
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows ");
int r = sc.nextInt();
System.out.println("Enter number of columns");
int c = sc.nextInt();
int[][] x = new int[r][c];
int[][] t = new int[c][r];
System.out.println("Enter elemnts in array X");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   x[i][j] = sc.nextInt();
}  
System.out.println("Elements of Array X are=");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   System.out.print(" "+x[i][j]);
    System.out.println(" ");
}   
 
//transpose
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
   t[j][i]=x[i][j];
}
System.out.println("Transpose  array are");
for(int i=0;i<c;i++)
{
  for(int j=0;j<r;j++)
   System.out.print(" " +t[i][j]);
   System.out.println(" ");
}   
}
}