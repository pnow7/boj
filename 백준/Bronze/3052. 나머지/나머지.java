import java.io.*;
import java.util.*;

public class Main {
	
	private static int[] check = new int[42];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Arrays.fill(check, -1);
		
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			
			check[num % 42] = num % 42;
		}
		
		int count = 0;
		
		for (int i = 0; i < check.length; i++) {
			if (check[i] != -1) {
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}