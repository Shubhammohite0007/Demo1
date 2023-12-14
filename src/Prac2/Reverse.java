package Prac2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name ");
		
		String orignal=sc.nextLine();
		String reverse="";
		
		for(int i=orignal.length()-1;i>=0;i--) {
			reverse=reverse+orignal.charAt(i);
		}
		System.out.println(reverse);
		

		
		
	}

}
