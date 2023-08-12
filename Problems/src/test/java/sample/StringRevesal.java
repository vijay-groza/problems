package sample;

public class StringRevesal {
	
	public static void main (String[]ars) {
		
		String lang = "MalayalaM";
		String rev = "";
		int len = lang.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+lang.charAt(i);
		
		}
			System.out.println(rev);
			
		if(lang.endsWith(rev))
		{
		System.out.println("the given string is palindrome");
		}
		else 
		{
		System.out.println("the given string is not palindrome");
		}
	}


	}
	

