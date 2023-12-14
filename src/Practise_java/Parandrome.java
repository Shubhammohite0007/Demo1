package Practise_java;

import java.util.Scanner;

public class Parandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         
		System.out.println("Enter number ");
		int num=sc.nextInt();
		
		int Temp=num;
		int rem;
		int reverse=0;
		
		while(num!=0){
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(Temp==reverse) {
			System.out.println(" Parandrome number"+Temp+"="+reverse);
		}else {
			System.out.println("Not a parandrome number");
		}
		
		
		
		
		
		
	}

}
