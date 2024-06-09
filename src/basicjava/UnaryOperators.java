package basicjava;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Unary operators include ++ --
		
		int a=1;
		System.out.println(a++);
		System.out.println(a);//a=a+1; //post increment operator
		System.out.println(a++);
		System.out.println(a++);
		
		
		
		int b=10;
		System.out.println(b--);//a=a+1; //post decrement operator
		System.out.println(b--);
		System.out.println(b--);
		
		
		
		int c=2;
		System.out.println(++c);//a=1+a; //pre increment operator
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		System.out.println(++c);
		
	}

}
