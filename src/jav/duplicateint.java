package jav;

public class duplicateint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,3,2,7,8,9};
		
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					System.out.println("deuplicate num"+a[i]);
				}
			}
		}
	}

}
