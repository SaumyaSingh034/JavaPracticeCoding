
public class PrimeNumber {

	public static void main(String[] args) {
		// Given Number is Prime or Not
		
		int num = 742;
		boolean flag = false;
		for(int i =2;i<=num/2;i++)
		{
		if(num%i==0)
		{
			flag=true;
			break;
		}
		
		
		}
		if(flag)
		{
			System.out.println("No a Prime Number");
		}
		else
		{
			System.out.println("Is Prime Number");
		}
	}

}
