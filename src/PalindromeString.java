
public class PalindromeString {

	public static void main(String[] args) {
		// Check if given string is palindrome or not
		
		String s = "madam";
		String rev = "";
		for(int i =s.length()-1;i>=0;i--)
		{
			//System.out.print(s.charAt(i)+"\t ");
			rev = rev + s.charAt(i);
		}
	
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not plaindrome");
		}

	}

}
