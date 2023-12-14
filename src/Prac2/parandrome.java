package Prac2;

import java.util.Scanner;

public class parandrome {

	public static void main(String[] args) {
		
		//1234321
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter num");
		int num=sc.nextInt();
		int orignal=num;
		int reverse=0;
		int rem;
		
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(reverse==orignal) {
			System.out.println("Parandrome number= "+reverse+" "+orignal);
		}else {
			System.out.println("not parandrome");
		}

	}

}
