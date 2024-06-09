
public class MultudimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[8];
		
		int arr[][]= {{1,2,3,4},{3,4,5},{6,7,8},{9,10,11}};

		//outer loop
		for(int i=0;i<arr.length;i++) { //1,2,3  3,4,6
			
			//inner loop
			for(int j=0;j<arr[i].length;j++) { //1,2,3 indivial
				
				
				System.out.print(arr[i][j]+" ");
			}
			
		System.out.println();
		}
		

	}

}
