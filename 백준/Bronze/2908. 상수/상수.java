import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int constA = (a / 100) + (a % 10) * 100 + ((a - (a / 100) * 100) / 10) * 10;
		int constB = (b / 100) + (b % 10) * 100 + ((b - (b / 100) * 100) / 10) * 10;
		
		System.out.println(Math.max(constA, constB));
		br.close();
	}
	
}