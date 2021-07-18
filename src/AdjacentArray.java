
public class AdjacentArray {

	public static void main(String[] args) {
		// Maximum difference between any adjacent array
		int[] arr = {4,7,9,10,56,67,88,98,108,110};
		int diff = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1] - arr[i] > diff)
			{
				diff = arr[i+1] - arr[i];
			}
		}
		System.out.println(diff);

	}

}
