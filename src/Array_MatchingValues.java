import java.util.ArrayList;

public class Array_MatchingValues {

	public static void main(String[] args) {
		// Comapre two array and create different array that contains matching value
		
		int[] arr1  = {5,8,9,10,78,99,54,33};
		int[] arr2 = {7,10,9,8,88,99,22,33};

		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				
			
			if(arr1[i] == arr2[j])
			{
				al.add(arr1[i]);
			}
			}
			
		}
		Object[] c = al.toArray();
		for(Object obj : c)
		{
			System.out.println(obj);
		}

	}

}
