package Practise_java;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123;
		int rem;
		int temp=num;
		int arm=0;
		
		while(num>0) {
			
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(arm==temp) {
			System.out.println("Armstrong num");
		}else {
			System.out.println("not armsrong num");
		}
		
		
		
		
		
	}

}
