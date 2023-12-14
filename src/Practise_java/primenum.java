package Practise_java;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//div by itself and only 1 num 
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		int temp=0;
		
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}if(temp==0) {
			System.out.println("Prime "+num);
		}else {
			System.out.println("Not prime"+num);
		}
		
		
	}

}
