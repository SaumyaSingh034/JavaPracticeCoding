class Pattern4
{
public static void main(String[] arr)
{
for(int row=0;row<=5;row++)
{
 for(int col=1;col<=5-row;col++)
 {
  System.out.print(" ");
 }
 for(int col1=1;col1<=row;col1++)
 {
  System.out.print(col1);
 }
 System.out.println("");
 }
 }
 }