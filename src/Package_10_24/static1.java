package Package_10_24;

public class static1 {

	static int z=1000;
	
	public static void collage() {
		System.out.println(" collage name is NMVP");
		
	}
	
	public static void fees() {
		
		int a=10;
		int b=10;
		System.out.println("fees is "+a*b);
	}
	
	
	public static void main(String[] args) {
		collage();
		fees();
		static1 s=new static1();
		s.collage();
		s.fees();
		System.out.println(z);

	}

}
