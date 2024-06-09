package oopsconcepts;

public class ClassAnimal implements Animal,ChildIntrface{



	@Override
	public void cat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dog() {
		// TODO Auto-generated method stub
		System.out.println("im a dog");
		
	}

	@Override
	public void pig() {
		// TODO Auto-generated method stub
		System.out.println("im a pig");

	}

	@Override
	public void goat() {
		// TODO Auto-generated method stub
		System.out.println("im a goat");

	}

	@Override
	public void parrot() {
		// TODO Auto-generated method stub
		System.out.println("im a parrot");

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAnimal ca=new ClassAnimal();
		ca.cat();
		ca.dog();
		ca.goat();
		ca.parrot();
		ca.pig();

	}

}
