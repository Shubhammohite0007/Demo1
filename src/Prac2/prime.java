package Prac2;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int temp=0;
		int orignal=sc.nextInt();
		
		for(int i=2;i<orignal;i++) {
			
			if(orignal%i==0) {
				temp=temp+1;
			}
		}if(temp==0) {
			System.out.println("Number is prime ");
		}
		else {
			System.out.println("Num is not prime ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
