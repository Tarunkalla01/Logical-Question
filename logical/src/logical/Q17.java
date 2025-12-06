package logical;

public class Q17 {
	public static void reverse(int num[] , int start , int end){
		while(start<end) {
			int temp = num[start];
			num[start]=num[end];
			num[end]= temp;
			start++;
			end--;
		}
	}	
public static void main(String[] args) {
	
	int arr[] = { 1,2,3,4,5,6,7,8,9} ;
	int k = 3 ;
	
	reverse(arr , 0 ,arr.length-1);
	reverse(arr , 0, k-1);
	reverse(arr , k, arr.length-1);
	
	for(int a : arr) {
		
		System.out.println(a);
	}
}
}
