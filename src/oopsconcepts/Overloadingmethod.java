package oopsconcepts;

public class Overloadingmethod {
	
public int sub(int a,int b) {
		
		System.out.println(a-b);
		return a-b;
	}

   public void sub(int a,int b,int c) {
		
		System.out.println(a-b-c);
	}
   
 

   public double sub(double a,double b,double c,double d) {
		
		System.out.println(a-b-c-d);
		return a-b-c-d;
	}
   
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloadingmethod om=new Overloadingmethod();
		om.sub(12, 13, 15, 16);
		om.sub(15, 2, 4);
	}

}
