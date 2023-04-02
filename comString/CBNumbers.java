package comString;

import java.util.Scanner;

public class CBNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		hello(sc.next());
	}

	public static void hello(String str) {

		int count = 0;
		boolean[] arr = new boolean[str.length()];

		for (int le = 1; le <= str.length(); le++) {
			for (int si = 0; si <= str.length() - le; si++) {

				int en = si + le;
				String s = str.substring(si, en);

				if (condtion(Long.parseLong(s)) == true && visited(arr, si, en) == false) {
					System.out.println(s);
					count++;
					for (int i = si; i < en; i++) {
						arr[i] = true;
					}

				}
			}

		}
		System.out.println(count);
	}

	public static boolean visited(boolean[] arr, int si, int en) {
		for (int i = si; i < en; i++) {
			if (arr[i] == true) {
				return true;
			}
		}
		return false;
	}

	public static boolean condtion(long s) {

		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		if (s == 0 || s == 1) {
			return false;

		}

		for (int i = 0; i < arr.length; i++) {
			if (s == arr[i]) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if ( s%arr[i] == 0) {
				return false;
			}
		}

		return true;
	}

}
