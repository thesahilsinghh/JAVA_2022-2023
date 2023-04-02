package Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 4, 5, 6, 7, 9 };
		int[] arr2 = { 1, 2, 3, 8 };
		int[] arr = merge(arr1, arr2);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int frst = arr1.length;
		int scnd = arr2.length;
		int[] ans = new int[frst + scnd];

		int x = 0;
		int y = 0;
		int i = 0;
		while (x < frst && y < scnd) {
			if (arr1[x] <= arr2[y]) {
				ans[i] = arr1[x];
				x++;
			} else {
				ans[i] = arr2[y];
				y++;
			}
			i++;
		}

		while (x < frst) {
			ans[i] = arr1[x];
			x++;
			i++;
		}
		while (y < scnd) {
			ans[i] = arr2[y];
			y++;
			i++;
		}
		return ans;

	}

}
