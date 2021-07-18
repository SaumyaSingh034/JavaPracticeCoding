
public class MinMultiDimensionalArray {

	public static void main(String[] args) {
		// Fetch Minimum value from Multidimensional Array
		
		int arr[][] = {{5,9,8},{1,76,88},{22,32,101}};
		
		int min , max;
		min = max = arr[0][0];
		
		//first Traveser through Rows
		for(int i=0;i<3;i++)
		{
			//Second traverse through col
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]<min)
				{
					min = arr[i][j];
				}
				if(arr[i][j]>max)
				{
					max = arr[i][j];
				}
			}
		}
		System.out.println("Minimum value from Multidimensional Array = "+min);
		
		System.out.println("Maximum value from Multidimensional Array = "+max);

	}

}
