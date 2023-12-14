package Practise_java;

import java.util.Scanner;

public class farenhitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int temperature;
		
		System.out.println("Enter value Temperature");
		temperature=sc.nextInt();
		
		temperature=((temperature-32)*5)/9;
		
		System.out.println("Temperature in celsius is "+temperature);

	}

}
