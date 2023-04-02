package Practice2023;

import java.util.Scanner;

public class FindCorrespondingIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		
		int []ans=index(arr, t);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]+" ");
		}

	}

	public static int[] index(int[] arr, int t) {

		int []ans=new int[2];
		for (int index1 = 0; index1 < arr.length - 1; index1++) {
			for (int i = index1 + 1; i < arr.length; i++) {
				if (arr[index1] + arr[i] == t) {
					ans[0] = index1 + 1;
					ans[1] = i + 1;
					return ans;
					
				}
			}
		}
		
		return null;
	}

}
