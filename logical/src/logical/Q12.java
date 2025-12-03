package logical;

import java.util.Scanner;

public class Q12 {
public static void main(String[] args) {
	
	int n1, n2, n3=0,i;
	System.out.println("Enter two number");
	Scanner sc = new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	
	for(i=1;i<=n1 && i<=n2;i++) {
		
		if(n1%i==0 && n2%i==0) {
			n3=i;
		}
		
	}
	System.out.println(n3);
}
}
