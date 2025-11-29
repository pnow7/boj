import java.io.*;
import java.util.*;

public class Main {
	
	private static int[] alpha = new int[26];
	private static boolean[] visited = new boolean[26];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String word = br.readLine();
		Arrays.fill(alpha, -1);
		
		for (int i = 0; i < word.length(); i++) {
			int charIndex =  word.charAt(i) - 'a';

			if (visited[charIndex]) {
				continue;
			} else {
				alpha[charIndex] = i;
				visited[charIndex] = true;
			}
		}
		
		for (int i = 0; i < alpha.length; i++) {
			sb.append(alpha[i]).append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}