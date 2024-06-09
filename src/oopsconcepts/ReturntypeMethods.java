package oopsconcepts;

public class ReturntypeMethods {

	public int add(int a,int b) {
		
		int c=a+b;
		return c;
		
	}
	
	public String details(int rollnum,String name,String subject) {
		
		System.out.println(rollnum);
		return name+subject;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturntypeMethods rm=new ReturntypeMethods();
		System.out.println(rm.add(12, 15));
		
		System.out.println(rm.details(1, "sushma ", "maths"));
		System.out.println(rm.details(2, "vishali ", "science"));

		

	}

}
