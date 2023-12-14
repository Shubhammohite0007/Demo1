package Prac2;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<=num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;	
		}
	
		

	}

}
