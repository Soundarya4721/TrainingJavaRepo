package controlstatements;

public class IfconditionalStatements {

	public static void main(String[] args) {

		//Voting scenario
		
		int voterage=17;
		
		
		//if loop
		if(voterage>=18) {
			
			System.out.println("you are eligble for voting");	
			
			
		}
		
		if(voterage<=0) {
			
			System.out.println("0  and below number is not a valid number");
		}
		

		 if(voterage==17) {
			
			System.out.println("Try voting next year");
		}
		
		else if(voterage==100) {
			
			System.out.println("Thanks for csting vote in this elder age");
		}
		
		else
		{
			System.out.println("You are not eligible for voting");
		}
	}

}
