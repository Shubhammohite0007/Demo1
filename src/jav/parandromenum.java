package jav;

import java.util.Scanner;

public class parandromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int reverse=0;
		int temp=num;
		int rem=0;
		
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(temp==reverse) {
			System.out.println("parandrome num "+reverse+"="+temp);
		}else {
			System.out.println("Non Parandrome");
		}
		
		

	}

}
