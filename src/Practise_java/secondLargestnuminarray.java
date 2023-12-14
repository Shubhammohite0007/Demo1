package Practise_java;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the numbers");
		//''int num=sc.nextInt();
		
		int a[]= {4,23,65,43,12,67};
		
		Arrays.sort(a);
		
		System.out.println("second largest num is "+a[a.length-2]);
		
		
	}

}
