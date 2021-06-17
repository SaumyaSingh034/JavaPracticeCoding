class Pm
{
public static void main(String[] arr)
{
int c=1;
 
 for(int row = 5;row>0;row--)
 {
  for(int col=1;col<=row*2;col++)
  { 
  System.out.print("  ");
  }
  for(int col1=1;col1<=c;col1++)
  {
  System.out.print(c);
  }
  for(int j=c-1;j>=1;j--)
  System.out.print(j);
  System.out.println("");
  c++;
  }
  }
  }