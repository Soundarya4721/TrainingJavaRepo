package controlstatements;

public class Breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
			
			if(i==6) {
				
				break;
			}
			
		}
		
		System.out.println("=====================================");
		
		/*
		 * continue statement
		 */
		
		for(int i=10;i>=1;i--) {
			
			
			
			if(i==6) {
				
				continue;	
			}
			System.out.println(i);

		}
		
	}

}
