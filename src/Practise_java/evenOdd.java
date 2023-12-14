package Practise_java;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Scanner sc=new Scanner(System.in);
                 System.out.println("Enter number");
                 
            int num=sc.nextInt();
            
            if(num%2==0) {
            	System.out.println("even number");
            }else {
            	System.out.println("Odd num");
            }
	}

}
