package Practise_java;

import java.util.Scanner;

public class swapWithoutvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		
		System.out.println("before"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("after"+a+" "+b);
		
		
		
		
	}

}
