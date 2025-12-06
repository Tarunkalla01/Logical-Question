package logical;

import java.util.Scanner;

public class Q24 {
public static void main(String[] args) {
	int n ;
	System.out.println("Enter number :");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	int a=n;
	
	int sum=0;

	while(n>0) {
		int temp = n%10;
		sum=sum+(temp*temp*temp);
		n=n/10;
	}
	System.out.println(n);
	
	if(sum==a) {
		System.out.println("armstrong number");
		
	}
	else {
		System.out.println("not an armstrong number ");
	}
}
}
