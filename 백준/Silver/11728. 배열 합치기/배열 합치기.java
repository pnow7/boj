import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		int[] B = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0, p2 = 0;
        
        while (p1 < N && p2 < M) {
        	if (A[p1] <= B[p2]) {
        		sb.append(A[p1++]).append(" ");
        	} else {
        		sb.append(B[p2++]).append(" ");
        	}
        }
        
        while (p1 < N) {
        	sb.append(A[p1++]).append(" ");
        }
        
        while (p2 < M) {
        	sb.append(B[p2++]).append(" ");
        }
        
        System.out.println(sb.toString());
        br.close();
	}

}