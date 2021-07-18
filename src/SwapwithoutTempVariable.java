
public class SwapwithoutTempVariable {

	public static void main(String[] args) {
		// Swapping without using Temp Variable
		int a = 8;
		int b = 2;
		
		System.out.println("Before Swapping");

		System.out.println(a);
		System.out.println(b);
		
		a = a+b; //a = 10
		b = a-b;  //b = 8
		a = a-b; //2
		
		System.out.println("After Swapping");

		System.out.println(a);
		System.out.println(b);
		
	}

}
