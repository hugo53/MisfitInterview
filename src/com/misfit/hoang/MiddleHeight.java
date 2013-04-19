/**
 * @author Minh-Hoang Nguyen
 *  
 *  Description:
 *  	Find the middle height of people
 */
package com.misfit.hoang;

import java.util.ArrayList;
import java.util.Collections;

public class MiddleHeight {
	public MiddleHeight() {
	}

	public int getMiddleHeight(ArrayList<Integer> _listHeight) {
		Collections.sort(_listHeight);
		return _listHeight.get((int) Math.ceil(_listHeight.size() / 2.0) - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input1 = new ArrayList<Integer>();
		input1.add(130);
		input1.add(142);
		input1.add(143);
		input1.add(153);
		input1.add(154);
		input1.add(155);
		input1.add(166);

		MiddleHeight mh = new MiddleHeight();
		System.out.println(mh.getMiddleHeight(input1));

		ArrayList<Integer> input2 = new ArrayList<Integer>();
		input2.add(130);
		input2.add(142);
		input2.add(143);
		input2.add(153);
		input2.add(154);
		input2.add(155);
		input2.add(166);
		input2.add(177);
		System.out.println(mh.getMiddleHeight(input2));
	}
}
