
public class SortArray {

	public static void main(String[] args) {
		// Sort Array is ascending and descending order
		
		//Ascending order with use of Temp Variable
		int[] arr = {6,8,3,1,5,2,4,7};
		//Here we will use Bubble Sort Concept
		int temp;
		
		System.out.println("Before Sorting ascending");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
			System.out.print(" ");					// 0 1  2  3  4  5  6  7
		}											// 1 8  6  3  5  2  4  7
		
		for(int i=0;i<arr.length;i++)              //i=1
		{
			for(int j=i+1;j<arr.length;j++)         //j=3
			{
				if(arr[i] > arr[j])                //3 > 1
				{
					//Swap
					temp = arr[i];                 //temp = 3 
														//arr[0] = 1 arr[3] = 3
					arr[i] = arr[j];   
					arr[j] = temp;  //arr[0] = 1
				}
			}
		}
		System.out.println("/n  After Sorting ascending");
		for(int l=0;l<arr.length;l++)
		{
			System.out.print(arr[l]);
			System.out.print(" ");
		}
	
	}

}
