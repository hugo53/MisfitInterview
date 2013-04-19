/**
 * @author Minh-Hoang Nguyen
 *  
 *  Description:
 *  	Find m minimum numbers in an int list
 */
package com.misfit.hoang;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumNumbers {
	/**
	 * Find m numbers minimum in list _inputNumbers
	 * 
	 * @param inputNumbers
	 * @param m
	 * @return a list contains m numbers minimum.
	 */
	public static ArrayList<Integer> mMinNumber(
			ArrayList<Integer> inputNumbers, int m) {
		if (inputNumbers.size() <= 0) {
			System.out.println("This list has no element!");
		} else if (inputNumbers.size() < m) {
			System.out.println("M is greater than size of this list!");
		} else {
			ArrayList<Integer> lRst = new ArrayList<Integer>();
			for (int i = 0; i < m; i++) {
				lRst.add(inputNumbers.remove(0));
			}

			for (int i = 0; i < inputNumbers.size(); i++) {
				for (int j = 0; j < m; j++) {
					if (inputNumbers.get(i) < lRst.get(j)) {
						lRst.remove(j);
						lRst.add(inputNumbers.get(i));
					}
				}
			}
			Collections.sort(lRst);
			return lRst;
		}
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> input1 = new ArrayList<Integer>();
		input1.add(2);
		input1.add(1);
		input1.add(6);
		input1.add(7);
		input1.add(4);
		input1.add(5);
		input1.add(7);
		input1.add(8);

		System.out.println(mMinNumber(input1, 3));
	}
}
