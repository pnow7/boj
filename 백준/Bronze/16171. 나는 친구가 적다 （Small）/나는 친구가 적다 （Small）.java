import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String K = br.readLine();
		
		String newS = S.replaceAll("[0-9]", "");
		
		boolean isContained = newS.contains(K);
		
		System.out.println(isContained ? "1" : "0");
		br.close();
	}

}