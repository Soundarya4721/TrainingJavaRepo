package accessmodifiers;

public class AccessModifiersPrivate {

	private int a=10;
	private int b=20;
	private int c=a+b;

	int i=1;
	int j=2;
	int k=i+j;
	
	protected double aa=12;
	protected double bb=15;
	protected double cc=aa+bb;
	
protected void doubleadd() {
		
		System.out.println(cc);
	}
	
	//method
	private void additionresult() {
		
		System.out.println(c);
	}
	
 void subtractionresult() {
		
		System.out.println(k);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersPrivate cc=new AccessModifiersPrivate();
		cc.additionresult();
				
	}

}
