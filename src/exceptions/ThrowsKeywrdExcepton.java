package exceptions;

public class ThrowsKeywrdExcepton {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
		int a=10/0;
		System.out.println(a);
		}
		catch(Exception e) {
			
			System.out.println(e);
		}

	}

}
