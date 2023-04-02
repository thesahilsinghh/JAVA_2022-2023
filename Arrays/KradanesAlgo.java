package Arrays;

public class KradanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, -4, 7, 5, -4, 11 };
		System.out.println(sa(arr));
	}

	public static int sa(int[] arr) {

		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				ans = Math.max(ans, sum);

				if (sum < 0) {
					sum = 0;
				}
			}

		}

		return ans;
	}

}
