package oopsconcepts;

public class ChildClassInheritence extends ParentclassInheritence{
	
	public void animal() {
		
		System.out.println("animal is cat");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClassInheritence CI=new ChildClassInheritence();
		CI.animal();
		CI.a=35;
		
	}

}
