
public class PyramidCode {

	public static void main(String[] args) {
		//Printing Pyramid Code
		
		for(int i=1;i<=5;i++) //i = 1
		{
			for(int j=1; j<=i;j++) //j = 2
			{
				System.out.print("*");   //* 
				System.out.print("\t");
			}
			System.out.println(""); //
		}

	}

}
