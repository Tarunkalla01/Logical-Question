package logical;

import java.util.Scanner;

public class Q20 {
public static void main(String[] args) {
	System.out.println("Enter a number ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=1; i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
	
}
}
