package capgemini.twochallenge.twoquestion;

public class VectorPairElements {

	public static void main(String[] args) {

		int[] n = {1, 5, 3, 4, 2};
		int x = 2, count = 0;
		
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n.length; j++) {
				if(n[i] - n[j] == x) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
