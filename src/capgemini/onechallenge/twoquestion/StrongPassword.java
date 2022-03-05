package capgemini.onechallenge.twoquestion;

import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final String password = scan.next();		
		final int size = 6;
		if(password.length() < size) {
			System.out.println(size - password.length());
		}else {
			System.out.println("0");
		}
		scan.close();
	}
}
