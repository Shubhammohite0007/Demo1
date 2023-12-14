package jav;

import java.util.Arrays;
import java.util.Comparator;

public class accendingString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		//String []words={"apple","mango","fruit"};
		int []words= {5,7,2,5};
		//Arrays.sort(words);
		//Arrays.sort(, Comparator.reverseOrder());
		//Arrays.sort(words);
		//Arrays.sort(words, Comparator.reverseOrder());
		
		//for(char i:words) {
		//	System.out.println(i);
		//}
		
		for(int i=0;i<=words.length;i++) {
			for(int j=i+1;i<=words.length;i++) {
				if(words[i]>words[j]) {
					temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
				System.out.println();
				
			}
		}

	}

}
