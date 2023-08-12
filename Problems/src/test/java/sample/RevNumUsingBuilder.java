package sample;

import java.util.Scanner;

public class RevNumUsingBuilder {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("number");
		int num=s.nextInt();
		/*int rev = 0;
		
		while(num!=0) {
		 rev =num%10;
		 num=num/10;
		System.out.print(rev);
		}*/
		StringBuilder sb=new StringBuilder();
		StringBuilder append = sb.append(num);
		System.out.println(		append.reverse());
}}
