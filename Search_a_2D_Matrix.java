package leetcode;

public class Search_a_2D_Matrix {

	public static void main(String[] args) {
//		int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
//		int[][] arr = { { 1 } };
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i][arr[0].length - 1]);
		}
		System.out.println(search(arr, 20));

	}

	public static boolean search(int[][] arr, int target) {
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col > -1) {
			if (arr[row][col] == target) {
				System.out.println(row + " , " + col);
				return true;
			}
			if (arr[row][col] < target) {
				row++;
			} else if (arr[row][col] > target) {
				col--;
			}
		}
		return false;
	}

}
