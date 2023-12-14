package Prac2;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int orignal=sc.nextInt();
		
		if(orignal%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd num");
		}
		
		
		

	}

}
