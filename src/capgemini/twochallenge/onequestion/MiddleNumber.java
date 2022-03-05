package capgemini.twochallenge.onequestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiddleNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> arr = new ArrayList<>();

		System.out.print("arr=");
		String numeros = scan.nextLine();

		arr = extractNumbersForArray(numeros);

		Collections.sort(arr);
		
		System.out.println(calculateMedian(arr));

		scan.close();

	}

	public static List<Integer> extractNumbersForArray(String str) {
		List<Integer> arr = new ArrayList<>();

		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher match = pattern.matcher(str);

		while (match.find()) {
			arr.add(Integer.parseInt(match.group().trim()));
		}

		return arr;
	}

	public static Integer calculateMedian(List<Integer> arr){
		
		int sizeArray = arr.size();
		int median;
		
		if(sizeArray % 2 == 0) {
			int j = ((arr.size()) / 2);
			int i = j - 1;
			median = (arr.get(j) + arr.get(i)) / 2;
			return median;
		}
		
		median = ((sizeArray + 1) / 2) - 1;
		return arr.get(median); 
	}
}
