package leetcode;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
//		int [] arr= {7,1,5,3,6,4};
		int[] arr = { 7, 6, 4, 3, 1 };

		System.out.println(maxProfit(arr));
	}

	public static int maxProfit(int[] arr) {
		int s_price;
		int b_price;
		int maxProf = Integer.MIN_VALUE;

		for (s_price = arr.length - 1; s_price > -1; s_price--) {
			for (b_price = s_price - 1; b_price > -1; b_price--) {
				int profit = 0;
				if (arr[s_price] > arr[b_price]) {
					profit = arr[s_price] - arr[b_price];
					System.out.println(profit);
					if (maxProf < profit) {
						maxProf = profit;
					}
				}

			}
		}
		if (maxProf < 0) {
			return 0;
		}
		return maxProf;
	}

}
