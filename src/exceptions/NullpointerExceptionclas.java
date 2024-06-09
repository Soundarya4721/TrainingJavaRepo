package exceptions;

public class NullpointerExceptionclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		String x=null;
		System.out.println(x.length());
		
		}
		
		catch(Exception e) {
			
			
			System.out.println(e);
		}
		finally {
			
			System.out.println("im finally block");
		}
	}

}
