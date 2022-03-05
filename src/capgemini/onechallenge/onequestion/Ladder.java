package capgemini.onechallenge.onequestion;

import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.printf("n = ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			int step = i;
			int complement=n;
			
			while (step < n) {
				System.out.printf(" ");
				step++;
			}
			
			while (complement+i > n) {
				System.out.printf("*");
				complement--;
			}
			System.out.println("");
		}
		scan.close();
	}
}
