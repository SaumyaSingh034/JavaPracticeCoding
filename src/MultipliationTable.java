
public class MultipliationTable {

	public static void main(String[] args) {
		// Print multiplication table without using Multiply Operator
		int result = multiplyTable(5,10);
		System.out.println(result);

	}
	
	public static int multiplyTable(int i, int j)
	{
		int k = 1;
		int sum = 0;
		while(k<=j)
			
		{
			sum += i;
			k++;
		}
		
		return sum;
	}

}
