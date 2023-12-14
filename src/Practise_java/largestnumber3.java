package Practise_java;

import java.util.Scanner;

public class largestnumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		num1=sc.nextInt();
		
		System.out.println("Enter num2");
		num2=sc.nextInt();
		
		System.out.println("Enter num3");
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is largest number"+num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("num2 is largest number"+num2);
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("num3 is largest num"+num3);
		}
		else {
			System.out.println("Cant determine the biggest number");
		}
		

	}

}
