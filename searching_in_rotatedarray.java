package leetcode;

public class searching_in_rotatedarray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
//		int[] arr = { 3, 4, 5, 6, 7 };

//		System.out.println(pivot(arr));
		System.out.println(search(arr, 3));
	}

	public static int search(int[] nums, int target) {
		int pivot = pivot(nums);

		int str = 0;
		int end = nums.length - 1;

		if (nums[pivot] == target) {
			return pivot;
		}
		if (pivot == -1) {
			return binarySearch(nums, target, str, end);
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

	public static int pivot(int[] arr) {
		int str = 0;
		int end = arr.length - 1;
		while (str < end) {
			int mid = str + (end - str) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > str && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[str] > arr[mid]) {
				end = mid - 1;
			} else {
				str = mid + 1;
			}
		}
		return -1;
	}

}