import java.util.Scanner;
class Array2DInstant
{
public static void main(String[] arr)
{
Scanner sc= new Scanner(System.in);
int[][] x= new int[3][2];
System.out.println("Enter elements in array");
for(int i=0;i<x.length;i++)
{ 
  for(int j=0;j<x[i].length;j++)
  { 
    x[i][j]= sc.nextInt();
  }
}
for(int i=0;i<x.length;i++)
{ 
  for(int j=0;j<x[i].length;j++)
  { 
    System.out.print(x[i][j]);
  }
  System.out.println(" ");
 
}
}
}

