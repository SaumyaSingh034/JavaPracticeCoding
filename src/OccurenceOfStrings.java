
public class OccurenceOfStrings {

	public static void main(String[] args) {
		// count Occurence of Strings
		
		String abc = "SaumAyaaaaaaa";
		//String a = "a";
		int count=0;
		for(int i=0;i<abc.length();i++)
		{
			if(abc.charAt(i) == 'a'|| abc.charAt(i) == 'A')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
