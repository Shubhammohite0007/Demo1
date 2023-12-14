package Prac2;

import java.util.Scanner;

public class comparetwostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter string 1");
		String s1="";
		Scanner st=new Scanner(System.in);
		String s2="";
		
		if(s1.compareTo(s2)>0) {
			System.out.println("s1 is bigger");
		}else {
			System.out.println("s2 is bigger");
		}

	}

}
