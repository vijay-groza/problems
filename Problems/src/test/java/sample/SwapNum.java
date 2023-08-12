package sample;

import java.util.Scanner;

public class SwapNum {
	public static void main(String[] args) {
		//Scanner s= new Scanner(System.in);
		//System.out.println("enter x");
		//System.out.println("enter y");
		int x=10;
		int y=20;
		int temp;
		//x=s.nextInt();
		//y=s.nextInt();
		System.out.println("before swap"+x+y);
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("after swap"+x+y);
	}
}
