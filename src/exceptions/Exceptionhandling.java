package exceptions;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		int i=100/0;
		System.out.println(i);
	}
	
  /*  catch(ArithmeticException e) {
	 
	 System.out.println(e);
	 System.out.println("this is arthimetic exception");
 }*/

	catch(Exception e) {
		
		
		System.out.println(e);
	}
	
	}
	
	

}
