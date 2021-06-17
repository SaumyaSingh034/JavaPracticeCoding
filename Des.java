class Des
{
 public static void main(String[] arr)
 { 
   int n=0;
  for(int i=0;i<4;i++)
  {
   for(int j=0;j<4-i;j++)
   {
    System.out.print(" ");
	}
 for(int k=0;k<=i;k++)
{ 
   System.out.print(++n);
   System.out.print(" ");   
 }
   System.out.println();
  }
  }
  }