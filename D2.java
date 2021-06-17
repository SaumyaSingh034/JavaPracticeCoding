class D2
{
public static void main(String[] arr)
{
int c=0;
int a=1;
for(int i=0;i<3;i++)
{
  for(int j=0;j<a;j++)
    {
      System.out.print(++c);
    }
  a=a+a;
  System.out.println("");
 }
 for(int i=2;i>=1;i--)
 {
   for(int j=4;j>i;j--)
   System.out.print(++c);
   System.out.println("");
  }
   } 
   }