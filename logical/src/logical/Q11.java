package logical;

import java.util.Iterator;
import java.util.Scanner;
//public class Q11 {	
//public static void main(String[] args) {
//	
//	// input array size 
//	System.out.println("Enter the size of array");
//	
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	
//	int arr[] = new int[n];
//	
//	for(int i=0 ; i<n ; i++) {
//		arr[i]=sc.nextInt();
//	}
//		
//		// two pointer approach
//		int low = 0;
//		int high = arr.length-1;
//		
//		while(low<high) {
//			int temp = arr[low];
//			arr[low]=arr[high];
//			arr[high]=temp;
//			low++;
//			high--;	
//		}
//		// printing array
//		
//		for(int i1 = 0; i1<n ;i1++) {
//			System.out.println(arr[i1]);
//		}
//		
//	}
//	
//	
//}



public class Q11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i = 0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		
		int low=0;
		int high = arr.length-1;
		
		while (low<high){
			int temp = arr[low];
			arr[low ]=arr[high];
			arr[high]=temp;
			low++;
			high--;
			
		}
		for(int i=0;i<n;i++){
		  System.out.println(arr[i]);
		}
	}
}

