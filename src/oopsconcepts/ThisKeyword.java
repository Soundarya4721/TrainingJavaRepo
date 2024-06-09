package oopsconcepts;

public class ThisKeyword {
	
	String name;
	int rollnum;
	
	//default constructor
	public ThisKeyword() {
		
		System.out.println("this is defaukt construtcor");
	}
	
	//parametrised constructor
	public ThisKeyword(String name,int rollnum){
		
		this();
		this.name=name;
		this.rollnum=rollnum;
		
		System.out.println(name);
		System.out.println(rollnum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword ths=new ThisKeyword("soundarya", 0);
		ThisKeyword ths2=new ThisKeyword("soundarya1", 10);

	}

}
