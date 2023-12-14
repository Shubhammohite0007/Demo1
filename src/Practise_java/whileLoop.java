package Practise_java;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an interger");
		
		
		int n;
		
		while((n=sc.nextInt())!=0) {
			System.out.println("You Entered "+ n);
		}
		System.out.println("out of loop");
		
		
		
	}

}
