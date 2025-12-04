import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = num[0];
        for (int i = 1; i < n; i++) {
            result = gcd(result, num[i]);
        }
        
        for (int i = 1; i <= result; i++) {
            if (result % i == 0) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.println(sb.toString());
        br.close();
    }
                            
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
                            
}