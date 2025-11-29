import java.io.*;
import java.util.*;

public class Main {

	private static int count = 0;
	private static int check;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			sol(num);
		}
		
		System.out.println(count);
		br.close();
	}
	
	private static void sol(int n) {
		if (n == 1) return;
		
		check = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 ) {
				check++;
			}
		}
		
		if (check == 2) {
			count++;
		}
		
	}
	
}