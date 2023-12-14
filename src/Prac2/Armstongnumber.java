package Prac2;

public class Armstongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1634;
		int temp=num;
		int rem;
		int arm=0;
		
		
	while(num!=0) {
		rem=num%10;
		arm=arm+(rem*rem*rem*rem);
		num=num/10;
	}
		if(arm==temp) {
			System.out.println("arm num");
		}else {
			System.out.println("not");
		}
		
		
		
		

	}

}
