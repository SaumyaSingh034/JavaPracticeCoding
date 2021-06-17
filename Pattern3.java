class Pattern3
{
public static void main(String[] arr)
{
int row;
for( row=0;row<5;row++)
{
  for(int col=0;col<row;col++)
  {
  System.out.print(" ");
  }
for(int col1=1;col1<=5-row;col1++)
{
System.out.print(col1);
}
System.out.println("");
}
}
}