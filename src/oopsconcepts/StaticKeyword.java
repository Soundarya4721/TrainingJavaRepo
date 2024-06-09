package oopsconcepts;

public class StaticKeyword {
	
	public static void add(int a,int b) {
		
		int c=a+b;
	System.out.println(c);
	}
	
	static int a=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticKeyword.add(12, 13);
		StaticKeyword.a=13;
		System.out.println(a);
		
		
	}

}
