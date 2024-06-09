package oopsconcepts;

public class Testshape extends Shape{

	

	@Override
	public void rectangle() {
		// TODO Auto-generated method stub
		System.out.println("im rectangle");
		
	}

	@Override
	public void triangle() {
		// TODO Auto-generated method stub
		System.out.println("im triangle");

	}

	@Override
	public void square() {
		// TODO Auto-generated method stub
		System.out.println("im square");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape sh=new Testshape();
      sh.triangle();
      sh.rectangle();
      sh.square();

}
}
