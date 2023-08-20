package leetcode;

import java.util.Arrays;
// Question--> https://leetcode.com/problems/next-permutation/description/
public class Next_Permutation {
	
	public void nextPermutation(int[] arr) {
		/*
		 * 1, 3,| 5, 4, 2 here traversing from back its first inc and then dec. So we
		 * have to find the break point which here is 3
		 */
		int _break = 0;
		boolean flag = false;
		for (int i = arr.length - 2; i > -1; i--) {
			if (arr[i] < arr[i + 1]) {
				flag = true;
				_break = i;
				break;
			}
		}
		if (!flag) {
			reverse(arr, _break, arr.length - 1);
			System.out.println(Arrays.toString(arr));
			return;
		}
		/*
		 * now from the break point we again traverse from back and find the next
		 * greater element in this case it is 4 Then we will swap the elements so the
		 * new arr will be 1,4,5,3,2
		 * 
		 */
		for (int i = arr.length - 1; i > -1; i--) {
			if (arr[_break] < arr[i]) {
				// we just swapped
				swap(arr, _break, i);
				break;
			}
		}
		reverse(arr, _break + 1, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public void reverse(int[] arr, int str, int end) {
		while (str < end) {
			swap(arr, str++, end--);
		}
	}

	public void swap(int[] arr, int _break, int i) {
		int temp = arr[_break];
		arr[_break] = arr[i];
		arr[i] = temp;
	}
}