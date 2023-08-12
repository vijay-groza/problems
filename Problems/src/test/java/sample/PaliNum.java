package sample;

import java.util.Scanner;

public class PaliNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("numbers");
	int num=sc.nextInt();
	
	int orgNum=num;
	int rev=0;
	while (num!=0) 
	{
		rev=rev*10+num%10;
		num=num/10;

	}		

	if(orgNum==rev) {
		System.out.println("the numbers are palindrome");
	}
	else
		System.out.println("the numbers are not palindrome");

}
}
