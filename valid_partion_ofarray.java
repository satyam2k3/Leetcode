package leetcode;
import java.util.*;
public class valid_partion_ofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,4,4,5,6};
		subarr(arr);
	}
	public static void subarr(int []arr) {
		for(int i = 0; i<arr.length; i++) {
			subarr(arr);
		}
	}

}
