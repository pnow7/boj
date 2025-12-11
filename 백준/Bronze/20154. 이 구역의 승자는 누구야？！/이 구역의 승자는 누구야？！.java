import java.io.*;

public class Main {

	private static int[] alphabetValues = {
			3, 2, 1, 2, 	3, 3, 3, 3, 	1, 1,
			3, 1, 3, 3, 	1, 2, 2, 2, 	1, 2,
			1, 1, 2, 2, 2, 1
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int n = word.length();
		int totalSum = 0;
		
		for (int i = 0; i < n; i++) {
			int index = word.charAt(i) - 'A';
			totalSum += alphabetValues[index];
		}
		
		System.out.println(totalSum % 2 != 0 ? "I'm a winner!" : "You're the winner?");
		br.close();
	}

}