package Practise_java;

import java.util.Scanner;

public class swapUsing3variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int temp;
		System.out.println(" Enter value of a");
		a=sc.nextInt();
		System.out.println(" Enter value of a");
		b=sc.nextInt();
		
		System.out.println("before swap "+a+" "+b);
		
		 temp=a;
		 a=b;
		 b=temp;
		 
		 System.out.println("after swap "+a+" "+b);
		 

	}

}
