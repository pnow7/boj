import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String P = br.readLine();
		
		int result = kmpSearch(S, P);
		
		System.out.println(result);
		br.close();
	}
	
	private static int kmpSearch(String S, String P) {
		int[] pi = getPi(P);
		int j = 0;
		
		for (int i = 0; i < S.length(); i++) {
			while (j > 0 && S.charAt(i) != P.charAt(j)) {
				j = pi[j - 1];
			}
			
			if (S.charAt(i) == P.charAt(j)) {
				if (j == P.length() - 1) {
					return 1;
				} else {
					j++;
				}
			}
		}
		
		return 0;
	}
	
	private static int[] getPi(String P) {
		int[] pi = new int[P.length()];
		int j = 0;
		
		for (int i = 1; i < P.length(); i++) {
			while (j > 0 && P.charAt(i) != P.charAt(j)) {
				j = pi[j - 1];
			}
			
			if (P.charAt(i) == P.charAt(j)) {
				j++;
				pi[i] = j;
			}
		}
		
		return pi;
	}
	
}