package comString;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "abcde";
		System.out.println(comp(s1, s2));

	}

	public static int comp(String s1, String s2) {
		int i = 0;
		int k = Math.min(s1.length(), s2.length());
		while (i <= k-1) {

			if (s1.charAt(i) > s2.charAt(i)) {
				return 1;

			}

			else if (s1.charAt(i) < s2.charAt(i)) {
				return -1;

			}
			i++;
		}

		return 0;

	}
}
