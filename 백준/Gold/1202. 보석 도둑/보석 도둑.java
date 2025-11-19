import java.io.*;
import java.util.*;

class Jewel {
    int weight;
    int value;
    
    public Jewel(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Jewel[] jewel = new Jewel[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            jewel[i] = new Jewel(M, V);
        }
        
        Arrays.sort(jewel, (j1, j2) -> {
            if (j1.weight == j2.weight) {
                return j2.value - j1.value;
            }
            return j1.weight - j2.weight;
        });
        
        int[] bags = new int[K];
        for (int i = 0; i < K; i++)  {
            bags[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(bags);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long totalValue = 0;
        int jewelIndex = 0;
        
        for (int bagCapacity : bags) {
            while (jewelIndex < N && jewel[jewelIndex].weight <= bagCapacity) {
                pq.add(jewel[jewelIndex].value);
                jewelIndex++;
            }
            
            if (!pq.isEmpty()) {
                totalValue += pq.poll();
            }
        }
        
        System.out.println(totalValue);
        br.close();
    }
    
}