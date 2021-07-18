import java.util.ArrayList;

public class PracticeCodeDaily {

	public static void main(String[] args) {
		// Fibonnaci Series
		// 0 1 1 2 3 5 8
		
		int a = 0;
		int b = 1;
		int sum = 0;
		int num = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(num<=10)
		{
			sum = a+b;
			System.out.print(sum+" ");
			a = b;
			b = sum;
			num++;
		}
		
	}

}
