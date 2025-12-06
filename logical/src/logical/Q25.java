package logical;

public class Q25 {
public static void main(String[] args) {
	int arr[]= {12,45,1,99,23,76};
	
	int largest=Integer.MIN_VALUE;
	int secondlargest= Integer.MIN_VALUE;
	System.out.println(largest);
	System.out.println(secondlargest);
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			secondlargest=largest;
			largest=arr[i];
		}
		else if(arr[i]>secondlargest && arr[i]!=largest){
			secondlargest=arr[i];
			
		}
		
	}
	if(secondlargest==Integer.MIN_VALUE) {
		System.out.println("second larh=gest not found ");
		
	}
	else {
		System.out.println(secondlargest);
	}
}
	
	
}
