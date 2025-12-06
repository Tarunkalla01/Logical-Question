package logical;

import java.util.Scanner;

public class Q26 {
public static void main(String[] args) {
	System.out.println("Enter number :");
	int n;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	
	int num1=0;
	int num2=1;
	System.out.print(num1+","+num2);
	for (int i=2;i<n;++i) {
		
		int num3=num1+num2;
		
		System.out.print(num3+",");
		num1=num2;
		num2=num3;
	}
}
}
