
public class SwapWithTempVariable {

	public static void main(String[] args) {
		// Swapping with Temp Variables
		int a = 8;
		int b = 2;
		int temp;
		System.out.println("Before Swapping");

		System.out.println(a);
		System.out.println(b);
		
		temp = a; //8
		a = b; //2
		b = temp; //8
		
		System.out.println("After Swapping");

		System.out.println(a);
		System.out.println(b);
	}

}
