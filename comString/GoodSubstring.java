package comString;

import java.util.Scanner;

public class GoodSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		substrg(sc.next());

	}

	public static void substrg(String str) {
		int count = 0;
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {

			if (vowel(str.charAt(i)) == true) {
				count++;

			}

			else {
				ans = Math.max(ans, count);
				count = 0;
			}
			
		}
		ans = Math.max(ans, count);
		System.out.println(ans);
	}

	private static boolean vowel(char i) {
		
		if(i=='a'||i=='e'||i=='o'||i=='i'||i=='u') {
			return true;
		}
		return false;
	}

}
