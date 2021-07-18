
public class SumOfArray {
	
	//Methods which accepts array and return sum of all elements in array
	public static void main(String[] args)
	{
		int[] arr = {4,7,9,10,56,87,200};
		
		int sum = sumArray(arr);
		System.out.println(sum);
		
	}
	public static int sumArray(int[] arr)
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		return sum;
	}

}
