package jav;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String reverse="";
		System.out.println("Enter name");
		String orignal;
		orignal=sc.nextLine();
		
		//int length=orignal.length();
		
		for(int i=orignal.length()-1;i>=0;i--) {
			reverse=reverse+orignal.charAt(i);
		}
		System.out.println(reverse);
		
		
		
		

	}

}
