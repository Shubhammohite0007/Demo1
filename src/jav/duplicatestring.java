package jav;

import scala.Char;

public class duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="shubhamm";
        char[] ch=s.toCharArray();
        
        for(int i=0;i<=s.length()-1;i++) {
        	
        	for(int j=i+1;j<s.length();j++) {
        		if(ch[i]==ch[j]) {
        			System.out.println("dup ="+ch[i]);
        		}
        	}	
        }

	}

}
