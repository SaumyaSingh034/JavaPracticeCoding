import java.util.Scanner;
class AddDiagonal
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows");
int r = sc.nextInt();
//System.out.println("Enter number of cols");
//int c = sc.nextInt();
int ld=0,rd=0;
int[][] a=new int[r][r];
System.out.println("Enter elements in Matrix");
for(int i=0;i<r;i++)
{
  for(int j=0;j<r;j++)
  {
   a[i][j]= sc.nextInt();
  }
 }
for(int i=0;i<r;i++)
{
 for(int j=0;j<r;j++)
 {
  if(i==j)
  {
   ld = ld +a[i][j];
    System.out.print(a[i][j]+"\t");
   }
else if(i+j==r-1)
{
System.out.print(a[i][j]+"\t");
rd = rd+a[i][j];
}
else
{
System.out.print("\t");
}
}
System.out.println();
}
System.out.println("Left Diagonal"+ld);
System.out.println("Right diagonal"+rd);
int result = rd+ld;
System.out.println(result);
}
}