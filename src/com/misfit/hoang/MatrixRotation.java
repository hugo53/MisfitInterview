/**
 * @author Minh-Hoang Nguyen
 * 
 * Description: rotate a NxN matrix
 */
package com.misfit.hoang;

public class MatrixRotation {

	/**
	 * Fomular: newArray[i][j] = oldArray[N-1-j][i]
	 * 
	 * @param inArray
	 * @return
	 */
	public static int[][] rotateMatrix(int[][] inArray) {
		int N = inArray.length;
		int[][] outArray = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				outArray[i][j] = inArray[N - 1 - j][i];
			}
		}
		return outArray;
	}

	public static void main(String[] args) {
		int[][] sampleArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] resultArray = rotateMatrix(sampleArray);
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < resultArray.length; j++) {
				System.out.print(resultArray[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
