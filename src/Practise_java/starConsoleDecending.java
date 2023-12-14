package Practise_java;

public class starConsoleDecending {

	// * * * * *
	// * * * *
	// * * *
	// * * 
	// *
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("* ");
			}
			for(int m=1;m<=i;m++) {
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}
		
		
		
	}

}
