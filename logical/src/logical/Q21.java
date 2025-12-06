package logical;

public class Q21 {
	public static void main(String[] args) {
		int arr[]= { 1,2,3,5,6,7} ;
		int n = (arr.length+1);
		int sum = 0 ;
		int expsum = n*(n+1)/2;
		
		for(int i = 0; i<arr.length ; i++) {
			sum = sum+arr[i];
		}
		
		int missNumber = expsum - sum;
		
		System.out.println(missNumber);
		
	}	
}
