import java.io.*;
import java.util.*;

public class Main {
	
    private static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] num = new int[K];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        sol(num, 0, N);

        System.out.println(result);
        br.close();
    }

    private static void sol(int[] num, int number, int N) {
        if (number > N) {
        	return;
        }
        
        result = Math.max(result, number);
        
        for (int i = 0; i < num.length; i++) {
        	sol(num, number * 10 + num[i], N);
        }
    }
    
}