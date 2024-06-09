package oopsconcepts;

public class Objectcreation {

//parameterized method	
	public void add(int a,int b) {

		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Objectcreation obj=new Objectcreation();
       obj.add(13,-14);
       
       Calculator c=new Calculator();
       c.multiply(12, 12);
       
       
       
       
	}

}
