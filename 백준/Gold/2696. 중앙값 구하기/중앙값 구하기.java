import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            
            int M = Integer.parseInt(br.readLine());
            
            sb.append((M + 1) / 2).append("\n");
            
            int outputCount = 0;
            StringTokenizer st = null;
            
            for (int i = 0; i < M; i++) {
                if (i % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }
                
                int num = Integer.parseInt(st.nextToken());
                
                if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                    maxHeap.add(num);
                } else {
                    minHeap.add(num);
                }
                
                if (maxHeap.size() < minHeap.size()) {
                    maxHeap.add(minHeap.poll());
                } else if (maxHeap.size() > minHeap.size() + 1) {
                    minHeap.add(maxHeap.poll());
                }
                
                if ((i + 1) % 2 != 0) {
                    sb.append(maxHeap.peek()).append(" ");
                    outputCount++;
                    
                    if (outputCount % 10 == 0) {
                        sb.append("\n");
                    }
                }
            }
            
            if (M > 0 && outputCount % 10 != 0) {
                    sb.append("\n");
            }
        }
        
        System.out.println(sb.toString());
        br.close();
    }
    
}