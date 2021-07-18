
public class ReverseNumber {

	public static void main(String[] args) {
		// revereseNumber
		
		int num = 89776;
		int a;
		
		int rev = 0;
		int rem;
		while(num!=0)
		{
			rem = num%10; //rem = 8
			rev = rem + rev * 10; //67798
			num = num/10; // num = 
			
		
		}
		System.out.println(rev);

	}

}
