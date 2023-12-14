package Prac2;

import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int rem;
		int reverse=0;
		
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;	
		}
		System.out.println(reverse);
		
		

	}

}
