package logical;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String news = "";
		for(int i=0 ; i<s.length();i++) {
			char ch=s.charAt(i);
			if(news.indexOf(ch)<0) {
				news=news+ch;
			}
		}
		System.out.println(news);
	}
}
