package logical;

import java.util.Scanner;

public class Niven {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum=0;
	int n1=n;
	while(n>0) {
		int temp =n%10;
		sum=sum+temp;
		n=n/10;
		
	}
	if(n1/sum==0) {
		System.out.println("its a niven number");
	}
	else {
		System.out.println("its not a niven number");
	}
	
}
}
