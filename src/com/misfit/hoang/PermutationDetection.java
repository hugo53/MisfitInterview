/**
 * i. Given two unsorted integer array a and b with same size, determine if a is an permutation of b with
 * some solution better than sorting.
 * Example input: A: 1,2,3,4,5
 * B: 3,4,2,5,1
 * Example output: true
 */

package com.misfit.hoang;

public class PermutationDetection {

	/**
	 * Based on the characteristic of a integer range. Two integer range are
	 * same when their products are equal (without zero in the productions) and
	 * the difference of their sum is equal too.
	 * 
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static boolean isPermutation(int[] array1, int[] array2) {
		int difference = 0;
		long productArray1 = 1;
		long productArray2 = 1;

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != 0) {
				productArray1 = productArray1 * array1[i];
			}

			if (array2[i] != 0) {
				productArray2 = productArray2 * array2[i];
			}

			difference += array1[i] - array2[i];
		}
		if (difference == 0 && productArray1 == productArray2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 2, 5, 1 };
		System.out.println(isPermutation(array1, array2));
	}
}
