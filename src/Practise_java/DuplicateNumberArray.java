package Practise_java;

public class DuplicateNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,34,1,2,3,4,};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate array "+a[i]);
				}
			}
		}
		
			
		
		
	}

}
