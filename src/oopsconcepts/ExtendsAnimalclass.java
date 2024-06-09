package oopsconcepts;

public class ExtendsAnimalclass extends AnimalAbstract {

	

	@Override
	public void dog() {
		// TODO Auto-generated method stub
		System.out.println("dog barks");
		
	}

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println("cat meows");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtendsAnimalclass exan=new ExtendsAnimalclass();
		exan.activity();
		exan.cat();
		exan.dog();

	}

}
