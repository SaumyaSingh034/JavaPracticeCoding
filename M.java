class M
{
public static void main(String[] arr)
{
int c=0;
for(int i=1;i<=4;i++)
{
 for(int j=0;j<(4-i);j++)
 {
  System.out.print("");
  }
  for(int k=1;k<=i;k++)
  {
   System.out.print(++c);
   for(int p=1;p<i;p++)
   {
   System.out.print(++c);
   }
   }
   System.out.println();
  }
  }
  }
   