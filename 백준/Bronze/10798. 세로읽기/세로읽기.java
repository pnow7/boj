import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] ch = new char[5][15];
		
		for (int i = 0; i < 5; i++) {
			String word = br.readLine();
			for (int j = 0; j < word.length(); j++) {
				ch[i][j] = word.charAt(j);
			}
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (ch[j][i] != 0) { 
					sb.append(ch[j][i]);
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}