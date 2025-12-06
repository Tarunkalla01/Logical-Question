package logical;

public class Q22 {
public static void main(String[] args) {
	
	int arr[]= {1,2,5,2,4,6,3,4,5};
	
	for(int i=0;i<arr.length;i++) {
		for(int j = i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
		}
	}
	
}
}
