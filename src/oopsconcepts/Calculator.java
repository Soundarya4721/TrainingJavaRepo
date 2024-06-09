package oopsconcepts;

public class Calculator {

	public void subtract(int a,int b) {
		
		int c=a-b;
		System.out.println(c);
	}
	
	public void multiply(int a,int b) {
		
		
		int c=a*b;
		System.out.println(c);
	}
	
	
	public void print() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Objectcreation obj1=new Objectcreation();
		obj1.add(15, 19);
		
		Calculator c=new Calculator();
		c.subtract(15, 2);
		
		c.multiply(13, 11);

		
	 Calculator c1=new Calculator();
		c1.multiply(12, 13);
		
		c1.print();
		
	}

}
