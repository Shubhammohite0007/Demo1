package jav;

import java.util.Scanner;

// prime num is the num which is divisible by 1 or itself 
//if in loop we check then it will always continue to print prime not prime like that so we are using temp variable to 
//remove from the lopp 
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to check wheter Num is prime or not");
		int num=sc.nextInt();
		int temp=0;
		
		
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Number is prime "+num);
		}
		else {
			System.out.println("Num is not prime "+num);
		}
		
		
		
		
	}

}
