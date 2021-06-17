class Design1
{
public static void main(String[] arr)
{
int n=0;
for(int i=5;i>1;i--)
{
  for(int j=1;j<i;j++)
  {
   System.out.print(" ");
   }
   for(int k=5;k>=i;k--)
   {
  System.out.print(++n);
  System.out.print(" ");
  }
  System.out.println("");
  }
  }
  }