package jav;

public class armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=153;
		int rem=0;
		int temp=0;
		
		while(num!=0) {
			rem=rem%10;
			temp=temp+(rem*rem*rem);
			num=num/10;
		}
		if(num==temp) {
			System.out.println("armstrong"+num);
		}else {
			System.out.println("not armstrong"+num);
		}

	}

}
