package com.Leetcode;

public class WordSearch {
	static boolean nnn = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCB";

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					boolean ans=word(board, i, j, word, 0);
					if(ans==true) {
						return true;
					}
				}
			}
			return false;
		}
		System.out.println(nnn);

	}

	public static boolean word(char[][] board, int r, int c, String str, int idx) {
		if (str.length() == idx) {
			return true;
		}

		if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] == '*'
				|| board[r][c] != str.charAt(idx)) {
			return false;
		}

		int[] cc = { 1, 0, -1, 0 };
		int[] rr = { 0, 1, 0, -1 };

		board[r][c] = '*';
		for (int k = 0; k < rr.length; k++) {

			boolean sans = (word(board, r + rr[k], c + cc[k], str, idx + 1));
			if (sans == true) {
				return true;
			}
		}
		board[r][c] = str.charAt(idx);

		return false;

	}

}
