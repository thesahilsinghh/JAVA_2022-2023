package com.Recursion;

public class PermutationDuplicacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		permute("abca", "");

	}

	public static void permute(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			boolean t = true;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					t = false;
					break;
				}
			}
			if (t == true) {

				permute(ques.substring(0, i) + ques.substring(i + 1, ques.length()), ans + ch);
			}
		}
	}

}
