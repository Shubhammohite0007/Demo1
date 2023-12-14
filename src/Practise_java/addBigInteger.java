package Practise_java;

import java.math.BigInteger;
import java.util.Scanner;

public class addBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		
		String num1;
		String num2;
		
		System.out.println("Enter first number");
		num1=sc.next();
		System.out.println("Enter second number");
		num2=sc.next();
		
		BigInteger first=new BigInteger(num1);
		BigInteger second=new BigInteger(num2);
		
		BigInteger sum;
		
		sum=first.add(second);
		
		System.out.println("Result of addition is "+sum);
		
		
	}

}
