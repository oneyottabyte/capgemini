package capgemini.twochallenge.threequestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryptor {

	public static void main(String[] args) throws IOException {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.print("s = ");
		String s = br.readLine();

		System.out.println(encryptString(s));
	}

	public static String encryptString(String s) {
		
		s = s.replace(" ", "");

		int sizeString = s.length();
		int row, column;
		row = (int) Math.floor(Math.sqrt(sizeString));
		column = (int) Math.ceil(Math.sqrt(sizeString));

		if (row * column < sizeString) {
			row = column;
		}

		String arr[] = s.split("");
		String grid[][] = new String[row][column];
		int count = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if (count < sizeString) {
					grid[i][j] = arr[count];
					count++;
				}
			}
		}

		s = "";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (grid[j][i] != null)
					s += grid[j][i];
			}
			s += " ";
		}

		return s.trim();
	}
}
