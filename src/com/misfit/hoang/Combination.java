/**
 * Gen combination
 * Note: Uncompleted
 */
package com.misfit.hoang;

import java.util.ArrayList;

public class Combination {

	private static int count = 0;

	public static void swap(Integer[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public static void gen(Integer[] array, int start, int end) {
		if (end == 0) {
			print(array);
		} else if (end == 1) {
			Integer[] arrayTmp = array.clone();
			print(arrayTmp);
			count++;
			swap(arrayTmp, 0, 1);
			print(arrayTmp);
			count++;
		} else {
			// Swap
			Integer[] arrayTmp = array.clone();
			for (int i = 0; i < end; i++) {
				swap(arrayTmp, i, end);
				gen(arrayTmp, 0, end - 1);
				swap(arrayTmp, i, end);
				print(arrayTmp);
				count++;
			}
		}
	}

	public static void print(Integer[] array) {
		for (int i : array) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

	public static void print(ArrayList<Integer[]> array) {
		for (Integer[] ir : array) {
			System.out.print("Is: ");
			for (Integer i : ir) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] arg) {

		Integer[] sampleArray = { 1, 2, 3 };

		gen(sampleArray, 0, sampleArray.length - 1);

		System.out.println(count + "\nDONE!");
	}
}
