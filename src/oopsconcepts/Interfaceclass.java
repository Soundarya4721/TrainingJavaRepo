package oopsconcepts;

public class Interfaceclass implements Interfaceex2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interfaceclass ic=new Interfaceclass();
		ic.interfacemethod1();
		ic.interfacemethod2();
	}

	@Override
	public void interfacemethod1() {
		// TODO Auto-generated method stub
		System.out.println("im a interface method");
		
	}

	@Override
	public void interfacemethod2() {
		// TODO Auto-generated method stub
		System.out.println("im here to achieve 100% abstraction");

	}

}
