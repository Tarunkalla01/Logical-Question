package logical;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		int i, j;
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if(i==j) {
				System.out.println(arr[i][j]*arr[i][j]+ " ");
				}
			}

		}System.out.println();
	}
}