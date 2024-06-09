package oopsconcepts;

public class Constructorexmple {
	
	//user defined constructor default
	public Constructorexmple() {
		
		System.out.println("hi am constructoer");
		
	}
	
	//parameterized method
public Constructorexmple(int a,int b) {
		
     int c=a+b;
     System.out.println(c);
	}
	
	
	
	public void Constructorexmples() {
		
		System.out.println("hi am method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructorexmple edv=new Constructorexmple();
		Constructorexmple edv1=new Constructorexmple(12,13);
	    edv.Constructorexmples();
	}

}
