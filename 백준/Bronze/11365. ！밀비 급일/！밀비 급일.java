import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String s = br.readLine();
			
			if (s.equals("END")) break;
			
			StringBuilder answer = new StringBuilder(s).reverse();
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}