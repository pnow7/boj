import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			if (!st.hasMoreTokens()) continue;
			String s = st.nextToken();
			String t = st.nextToken();
			
			int checkPoint = 0;
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
				char charS = s.charAt(i);
				
				for (int j = checkPoint; j < t.length(); j++) {
					char charT = t.charAt(j);
					
					if (charS == charT) {
						checkPoint = j + 1;
						count++;
						break;
					}
				}
			}
			
			if (count == s.length()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		br.close();
	}

}