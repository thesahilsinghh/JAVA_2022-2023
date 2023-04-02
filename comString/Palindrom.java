package comString;

import java.util.Iterator;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbstring("nitika");

	}

	public static void sbstring(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {

				String a = str.substring(i, j);
				if (hello(a) == 1) {
					System.out.println(a);
				}
			}
		}

	}

	public static int hello(String s) {

		int a = 0;
		int b = s.length() - 1;
		while (a < b) {

			if (s.charAt(a) != s.charAt(b)) {

				return 0;

			}

			else {
				a++;
				b--;
			}

		}

		return 1;
	}

}
