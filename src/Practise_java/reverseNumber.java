package Practise_java;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
		int rem;
		int reverse=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		while(num!=0) {
			 
			rem=num%10;
			reverse = reverse*10+rem;
			num=num/10;
			System.out.println(reverse);
		}
           System.out.println("Exacat reverse is "+reverse);
	}

}

//12345        rem=n%10    ==5        1234  == 4  ==  3
         //    reverse=reverse*10+rem  ==5 ==  5*10+4= 54 ==54*10+3= 543
         //    num=num/10;   ==1234  == 123 == 12