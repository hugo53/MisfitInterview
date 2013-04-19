/**
 * g. Given two sorted integer array, find the Kth smallest element among both arrays.
 */
package com.misfit.hoang;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumNumberTwoArray {

	/**
	 * Approach 1: simplest. Mix and re-sort.
	 * 
	 * @param array1
	 * @param array2
	 * @param index
	 * @return
	 */
	public static int minNumber(int[] array1, int[] array2, int index) {
		// Mix two arrays
		int[] arrayMix = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, arrayMix, 0, array1.length);
		System.arraycopy(array2, 0, arrayMix, array1.length, array2.length);

		// Sort
		ArrayList<Integer> tmpArray = new ArrayList<Integer>();
		for (int i = 0; i < arrayMix.length; i++) {
			tmpArray.add(arrayMix[i]);
		}
		Collections.sort(tmpArray);

		return tmpArray.get(index - 1);
	}

	// Approach 2

	public static void main(String[] args) {
		int[] array1 = { 2, 9, 15, 22, 24, 25, 26, 30 };
		int[] array2 = { 1, 4, 5, 7, 18, 22, 27, 33 };

		// Result is:9
		System.out.println("rs: " + minNumber(array1, array2, 6));
	}
}
