package leetcode;

import java.util.*;

public class Missing_Number {

	public static void main(String[] args) {
		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber2(arr));
	}

	public static int missingNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		System.out.println(set);
		List<Integer> list = new ArrayList<Integer>(set);
		if (list.get(0) != 0) {
			return 0;
		}
		for (int i = 0; i < list.size(); i++) {
			if (i + 1 == list.size()) {
				return list.get(i) + 1;
			}
			if (list.get(i) + 1 != list.get(i + 1)) {
				return list.get(i) + 1;
			}
		}
		return 0;
	}

	public static int missingNumber1(int[] nums) {
		Arrays.sort(nums);
		int n = nums[nums.length - 1];
		if (nums[0] != 0) {
			return 0;
		}
		int sum = (n * (n + 1)) / 2;
		int actual_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			actual_sum += nums[i];
		}
		if (sum - actual_sum == 0) {
			return n + 1;
		} else {
			return sum - actual_sum;
		}
	}

	public static int missingNumber2(int[] nums) {// most optimal solution
		int result = nums.length;
		for (int i = 0; i < nums.length; i++) {
			result = result + i - nums[i];
		}
		return result;
	}

}
