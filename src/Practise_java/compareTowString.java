
package Practise_java;

import java.util.Scanner;

public class compareTowString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String 1");
		String s1=sc.nextLine();
		
		System.out.println("Enter String 2");
        String s2=sc.nextLine();
        
        if(s1.compareTo(s2)>0) {
        	System.out.println("String 1 is bigger");
        }else if(s1.compareTo(s2)<0) {
        	System.out.println("String 2 is bigger");
        }
        else {
        	System.out.println("Both are same ");
        }
        
		
		
		
		
	}

}
