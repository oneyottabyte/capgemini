package capgemini.onechallenge.threequestion;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int anagrams = 0, checking1 = 0, checking2 = 0;
		String subString1, subString2;

		for (int i = 1; i < str.length(); i++) {
			checking1 = i;

			for (int j = 0; checking1 <= str.length(); j++) {
				subString1 = str.substring(j, checking1);
				checking2 = i + j + 1;

				for (int c = j + 1; checking2 <= str.length(); c++) {
					if (checking2 == str.length()) {
						subString2 = str.substring(c);
					} else {
						subString2 = str.substring(c, checking2);
					}
					char[] array1 = subString1.toCharArray();
					char[] array2 = subString2.toCharArray();
					Arrays.sort(array1);
					Arrays.sort(array2);
					if (Arrays.equals(array1, array2)) {
						anagrams++;
					}
					checking2++;

				}
				checking1++;
			}
		}
		System.out.println(anagrams);
		sc.close();
	}
}
