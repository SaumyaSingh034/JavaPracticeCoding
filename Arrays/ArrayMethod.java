class ArrayMethod
{
 static void min(int arr[])
 {
  int min = arr[0];
  for(int i=1;i<arr.length;i++)
  {
   if(min>arr[i])
   min = arr[i];
  }
  System.out.println("Minimum value"+min);
 }
 public static void main(String[] args)
 {
  int a[] ={34,78,90,1,2,345};
  min(a); //passing array in method
  //ArrayMethod.min(a);
  }
  }