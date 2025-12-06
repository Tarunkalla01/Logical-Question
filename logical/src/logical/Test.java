package logical;

import java.util.Scanner;
//
//public class Test {
//	
//	public static void main(String[] args) {
//		int n;
//		Scanner sc = new Scanner(System.in);
//		n=sc.nextInt();
//		
//		int i,j,k;
//		int arr[] = new int[n];
//		for(i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//			
//		}
//		int b[]=new int[n/2];
//		int c[]=new int[n/2];
//		j=0;
//		k=0;
//		for(i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				b[j++]=arr[i];
//			}
//			else {
//				c[k++]=arr[i];
//			}
//		}
//		i=0;
//		while(i<n/2) {
//			System.out.println(b[i]+" "+c[i]);
//			i++;
//		}
//		
//	}
//}

public class Test {
	public static void movezero(int arr[]) {
		int lastindex = arr.length-1;
		for(int i = arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
			arr[lastindex]=arr[i];
			lastindex--;
			}
		}
		for(int i=0;i<=lastindex ; i++) {
			arr[i]=0;
			i++;
		}
	}
	
	public static void main(String[] args) {
		int arr[] ={1,0,3,0,5,0,8,0};
		movezero(arr);
		
		for(int num :arr) {
			System.out.println(num);
		}
	}
	
}
















































