package leetcode;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {

	}

	public static int search(int[] nums, int target) {
		// first we have to find the pivot
		int pivot = pivot(nums);

		int str = 0;
		int end = nums.length - 1;

		if (pivot == -1) {

			// if no pivot then just simple binary search
			return binarySearch(nums, target, str, end);

		} else if ((nums[pivot] == target)) {

			// if target pivot element only
			return pivot;

		} else {
			if (target > nums[str]) {
				end = pivot - 1;
			} else if (target < nums[str]) {
				str = pivot + 1;
			} else {
				return str;
			}
			return binarySearch(nums, target, str, end);
		}
	}

	// just normal binary search with initalized parameters
	public static int binarySearch(int[] arr, int target, int str, int end) {
		while (str <= end) {
			int mid = str + (end - str) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				str = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	// finding the pivot
	public static int pivot(int[] arr) {
		int str = 0;
		int end = arr.length - 1;
		while (str < end) {
			int mid = str + (end - str) / 2;
			// terminate condition
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			// terminate condition
			if (mid > str && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			// main condition
			if (arr[str] > arr[mid]) {
				end = mid - 1;
			} else {
				str = mid + 1;
			}
		}
		return -1;
	}

}