package Arrays;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, -4, 7, 5, -4, 11 };
	}

	public static int sa(int[] arr) {

		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;

			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				ans = Math.max(ans, sum);

			}

		}

		return ans;
	}

}
