/**
 * 
 * @author hugo
 * @Description: k.Given a array of characters, reverse all the words in the
 *               array. ( Take space, period, comma, question mark and
 *               exclamation mark as the separator) . Example input:
 *               "The quick brown fox jumped over lazy old dog." Example output:
 *               "ehT kciuk nworb xof depmuj revo yzal dlo god."
 * 
 */

package com.misfit.hoang;

import java.util.StringTokenizer;

public class CharacterReversion {

	/**
	 * Reverse a word
	 * 
	 * @param inWord
	 * @return
	 */
	public static String reverseWord(String inWord) {
		int wordLength = inWord.length();
		String outWord = "";
		char[] inWordArray = inWord.toCharArray();
		char[] tmpInWordArray = new char[wordLength];

		for (int i = 0; i < wordLength; i++) {
			tmpInWordArray[i] = inWordArray[wordLength - 1 - i];
		}
		outWord = String.valueOf(tmpInWordArray);

		return outWord;
	}

	/**
	 * Reverse a char array
	 * 
	 * @param inChars
	 * @return
	 */
	public static char[] reverseChars(char[] inChars) {
		char[] outChars = new char[inChars.length];
		String outString = "";
		String inString = String.valueOf(inChars);
		StringTokenizer st = new StringTokenizer(inString, " .,?!", true);
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			outString += reverseWord(s);
		}
		outChars = outString.trim().toCharArray();

		return outChars;
	}

	public static void main(String[] args) {
		char[] sampleArray = "The quick brown fox ? jumped over lazy old dog."
				.toCharArray();
		System.out.println("Sample: ");
		for (char tmp : sampleArray) {
			System.out.print(tmp);
		}

		System.out.println("\nResult: ");
		for (char tmp : reverseChars(sampleArray)) {
			System.out.print(tmp);
		}
	}
}
