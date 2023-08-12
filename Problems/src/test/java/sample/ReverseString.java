package sample;

public class ReverseString {
		 
	public static void main(String[]args) {
		
		String s= "Good";
		int l=s.length();
		
		for (int i=l-1;i>=0;i--) {
			char reverse=s.charAt(i);
			System.out.println(reverse);
		}
	}
}
