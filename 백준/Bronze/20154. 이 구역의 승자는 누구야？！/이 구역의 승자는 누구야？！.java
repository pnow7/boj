import java.io.*;
import java.util.*;

public class Main {

	private static final int[] ALPHABETVALUES = {
			3, 2, 1, 2, 	3, 3	, 3, 3, 	1, 1,
			3, 1, 3, 3, 	1, 2, 2, 2, 	1, 2,
			1, 1, 2, 2, 2, 1
	};
	private static final String WINNER = "I'm a winner!";
	private static final String LOSER = "You're the winner?";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		
		String word = br.readLine();
		
		for (char c : word.toCharArray()) {
			list.add(ALPHABETVALUES[c - 'A']);
		}
		
		while (list.size() > 1) {
			List<Integer> nextList = new ArrayList<>();
			
			for (int i = 0; i < list.size() / 2; i++) {
				int sum = list.get(2 * i) + list.get(2 * i + 1);
				nextList.add(sum % 10);
			}
			
			if (list.size() % 2 != 0) {
				nextList.add(list.get(list.size() - 1));
			}
			
			list = nextList;
		}
		
		int result = list.get(0);
	
		System.out.println(result % 2 != 0 ? WINNER : LOSER);
		br.close();
	}

}