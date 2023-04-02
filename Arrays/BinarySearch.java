package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 5, 7, 9, 10, 13, 15, 19, 22 };
		int g = 22;
		System.out.println(bs(arr, g));
	}

	public static int bs(int[] arr, int g) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mi = (lo + hi) / 2;
			if (arr[mi] == g) {
				return mi;

			}

			else if (mi < g) {

				lo = mi + 1;

			}

			else {

				hi = mi - 1;

			}

		}

		return -1;

	}
}
