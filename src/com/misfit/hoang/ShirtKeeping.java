/**
 * @author Minh-Hoang Nguyen
 *  Description:
 *  	Find number ways to keep shirts in basket
 */

package com.misfit.hoang;

public class ShirtKeeping {

	/**
	 * Find ways to keep shirts in baskets
	 * 
	 * @param N
	 *            is number of shirts
	 * @param k
	 *            is number of baskets
	 */
	public static int findNumWays(int N, int k) {
		if (N < k) {
			return 0;
		} else if (N == k) {
			return factorial(k);
		} else {
			int tmpCombination = factorial(N) / factorial(N - k + 1);

			int totalRestCombination = 0;
			for (int i = 1; i <= (N - k); i++) {
				totalRestCombination += factorial(N - k)
						/ (factorial(i) * factorial(N - k - i));
			}

			return tmpCombination * totalRestCombination;
		}
	}

	/**
	 * Compute factorial of n
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findNumWays(2, 1));// 2 shirts - 1 basket
		System.out.println(findNumWays(2, 2));// 2 shirts - 2 basket
		System.out.println(findNumWays(2, 3));// 2 shirts - 3 basket
	}
}
