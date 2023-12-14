package jav;

import java.util.Arrays;
import java.util.Comparator;

public class decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num[]= {3,5,7,6,3,2};
		
	   Arrays.sort(num,Comparator.reverseOrder());
		
		
		for(int a:num) {
			System.out.println(a);
		}

	}

}
