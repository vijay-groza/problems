package sample;

public class OddOrEven {
	public static void main (String[]args) {
		int[] num = {1,2,3,4,5,6,7,8};
		System.out.print("The odd numbers are ");
		for(int i=0;i<num.length;i++) {
			if (num[i]%2!=0) 
			{
				System.out.print(" "+num[i]);
			}
		}
	}
}
