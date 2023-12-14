package Prac2;

import java.util.Scanner;

public class factorial {

	//1*2*3*4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int input=sc.nextInt();
		  int fact=1;
		  
		  for(int i=1;i<=fact;i++) {
			  fact=fact*i;
		  }
		  System.out.println(fact);
	}

}
