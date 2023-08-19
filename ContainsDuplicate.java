package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4 };
		System.out.println(Hash_map(arr));

	}

	public static boolean algo1(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public static boolean Hash_Set(int[] arr) {
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			// if the hashset already contains the element
			System.out.println(h);
			if (h.contains(h)) {
				return true;
			}
			// adding an element in the hash set
			h.add(arr[i]);
		}
		return false;
	}

	public static boolean Hash_map(int[] arr) {
		HashMap<Integer, Integer> seen = new HashMap<>();
		for (int num : arr) {

			if (seen.containsKey(num) && seen.get(num) >= 1) {
				return true;
			}
			// inserting a number
			seen.put(num, seen.getOrDefault(num, 0) + 1);
		}
		return false;
	}

}
