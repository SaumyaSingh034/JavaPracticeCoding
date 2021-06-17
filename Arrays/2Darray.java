import java.util.Scanner;
class 2Darray1
{
public static void main(String[] arr)
{
Scanner sc= new Scanner(System.in);
int[][] x;
x= new int[3][2];
System.out.println("Enter elements in array");
for(int i=0;i<x.length;i++)
{ 
  for(int j=0;j<x.length;j++)
  { 
    x[i][j]= sc.nextInt();
  }
}
for(int i=0;i<x.length;i++)
{ 
  for(int j=0;j<x.length;j++)
  { 
    System.out.println(x[i][j]);
  }
}
}
}

